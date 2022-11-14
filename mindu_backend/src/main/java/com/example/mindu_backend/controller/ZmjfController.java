package com.example.mindu_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mindu_backend.common.R;
import com.example.mindu_backend.entity.Sdgt;
import com.example.mindu_backend.entity.Zmjf;
import com.example.mindu_backend.service.ZmjfService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zmjf")//中闽建发
@CrossOrigin
public class ZmjfController {

    @Autowired
    private ZmjfService zmjfService;

    @GetMapping("/page")
    public R<Page> page(@RequestParam int page, int pageSize, String lessee) {
        //分页构造
        Page<Zmjf> pageInfo = new Page<>(page, pageSize);
        //条件构造
        LambdaQueryWrapper<Zmjf> queryWrapper = new LambdaQueryWrapper<>();
        //排序条件
//        queryWrapper.orderByAsc(Zmjf::getSort);
        //条件查询
        if(lessee != null){
            queryWrapper.like(StringUtils.isNotEmpty(lessee), Zmjf::getLessee, lessee);
        }
        //分页查询
        zmjfService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }
}
