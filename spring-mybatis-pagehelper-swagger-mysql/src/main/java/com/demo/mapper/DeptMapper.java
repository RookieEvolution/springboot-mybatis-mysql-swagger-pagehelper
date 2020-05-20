package com.demo.mapper;

import com.demo.javaBean.Department;


import java.util.List;

/*
*
* 测试pagehelper
* */
public interface DeptMapper {
    List<Department> findAll();
}
