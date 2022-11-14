package com.example.mindu_backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mindu_backend.common.R;
import com.example.mindu_backend.entity.LeaseMonthly;
import com.example.mindu_backend.service.LeaseMonthlyService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leaseMonthly")
@CrossOrigin
public class LeaseMonthlyController {

    @Autowired
    private LeaseMonthlyService leaseMonthlyService;

    @GetMapping("/page")
    public R<Page> page(@RequestParam int page, int pageSize, String lessee) {
        //分页构造
        Page<LeaseMonthly> pageInfo = new Page<>(page, pageSize);
        //条件构造
        LambdaQueryWrapper<LeaseMonthly> queryWrapper = new LambdaQueryWrapper<>();
        //排序条件
//        queryWrapper.orderByAsc(Zmjf::getSort);
        //条件查询
        if (lessee != null) {
            queryWrapper.like(StringUtils.isNotEmpty(lessee), LeaseMonthly::getLessee, lessee);
        }
        //分页查询
        leaseMonthlyService.page(pageInfo, queryWrapper);
        return R.success(pageInfo);
    }
}
