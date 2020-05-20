package com.demo.controller;

import com.demo.javaBean.Department;
import com.demo.mapper.DeptMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class DpController {

    @Autowired
    DeptMapper deptMapper;

    @GetMapping("/findAll/{pageNum}")
    public List<Department> findAll(@PathVariable int  pageNum, @RequestParam(defaultValue = "3") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Department> countries = deptMapper.findAll();

        PageInfo<Department> page = PageInfo.of(countries);
        System.out.println("每页展示条数：" + page.getPageSize());
        System.out.println("总条数：" + page.getTotal());
        System.out.println("当前页：" + page.getPageNum());
        System.out.println("总页数：" + page.getPages());

        return countries;
    }
}
