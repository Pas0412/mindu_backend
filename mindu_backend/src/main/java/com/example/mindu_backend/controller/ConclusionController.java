package com.example.mindu_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mindu_backend.common.R;
import com.example.mindu_backend.entity.Conclusion;
import com.example.mindu_backend.entity.Sdgt;
import com.example.mindu_backend.service.ConclusionService;
import com.example.mindu_backend.service.SdgtService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conclusion")
@CrossOrigin
public class ConclusionController {
    @Autowired
    private ConclusionService conclusionService;

    @GetMapping("/page")
    public R<Page> page(@RequestParam int page, int pageSize, float min, float max) {
        //分页构造
        Page<Conclusion> pageInfo = new Page<>(page, pageSize);
        //条件构造
        LambdaQueryWrapper<Conclusion> queryWrapper = new LambdaQueryWrapper<>();
        //排序条件
//        queryWrapper.orderByAsc(Conclusion::getSort);
        //条件查询
        if(min > 0 && max > 0){
            queryWrapper.and(i -> i.ge(Conclusion::getVideSurface, min).le(Conclusion::getVideSurface, max));
        }else if (min > max || (min > max && max == 0)){
            queryWrapper.ge(Conclusion::getVideSurface, min);
        }else if (max > 0){
            queryWrapper.le(Conclusion::getVideSurface, max);
        }
        //分页查询
        conclusionService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }
}
