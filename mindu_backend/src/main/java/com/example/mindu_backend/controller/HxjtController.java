package com.example.mindu_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mindu_backend.common.R;
import com.example.mindu_backend.entity.Hxjt;
import com.example.mindu_backend.service.HxjtService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hxjt")//华兴集团
@CrossOrigin
public class HxjtController {

    @Autowired
    private HxjtService hxjtService;

    @GetMapping("/page")
    public R<Page> page(@RequestParam int page, int pageSize, String lessee) {
        //分页构造
        Page<Hxjt> pageInfo = new Page<>(page, pageSize);
        //条件构造
        LambdaQueryWrapper<Hxjt> queryWrapper = new LambdaQueryWrapper<>();
        //排序条件
//        queryWrapper.orderByAsc(Zmjf::getSort);
        //条件查询
        if (lessee != null) {
            queryWrapper.like(StringUtils.isNotEmpty(lessee), Hxjt::getLessee, lessee);
        }
        //分页查询
        hxjtService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }
}
