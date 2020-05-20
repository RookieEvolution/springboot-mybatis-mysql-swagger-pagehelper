package com.demo.mapper;


/*
* 配置文件版
* */

import com.demo.javaBean.Employee;

public interface EmployeeMapper {

    public Employee getEmpById(int id);

    public void insertEmp(Employee employee);

    public void deleteEmpById(int id);

    public Boolean updateEmp(Employee employee);
}
