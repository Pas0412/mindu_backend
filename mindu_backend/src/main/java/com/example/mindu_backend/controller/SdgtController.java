package com.example.mindu_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mindu_backend.common.R;
import com.example.mindu_backend.entity.Sdgt;
import com.example.mindu_backend.entity.User;
import com.example.mindu_backend.service.SdgtService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sdgt")
@CrossOrigin
public class SdgtController {
    @Autowired
    private SdgtService sdgtService;

    @GetMapping("/page")
    public R<Page> page(@RequestParam int page, int pageSize, String lessee) {
        //分页构造
        Page<Sdgt> pageInfo = new Page<>(page, pageSize);
        //条件构造
        LambdaQueryWrapper<Sdgt> queryWrapper = new LambdaQueryWrapper<>();
        //排序条件
//        queryWrapper.orderByAsc(Sdgt::getSort);
        //条件查询
        if(lessee != null){
            queryWrapper.like(StringUtils.isNotEmpty(lessee), Sdgt::getLessee, lessee);
        }
        //分页查询
        sdgtService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }
}
