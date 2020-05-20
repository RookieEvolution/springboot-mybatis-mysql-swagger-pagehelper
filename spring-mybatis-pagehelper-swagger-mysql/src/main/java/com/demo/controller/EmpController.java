package com.demo.controller;

import com.demo.javaBean.Department;
import com.demo.javaBean.Employee;
import com.demo.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/emp/{id}")
    public Employee getEmployee(@PathVariable("id") int id){

        return employeeMapper.getEmpById(id);
    }
    @GetMapping("/emp")
    public Employee insertEmployee(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }
    @GetMapping("/emp/del/{id}")
    public int deleteEmployee(@PathVariable("id") int id){
        employeeMapper.deleteEmpById(id);
        return id;
    }
    @GetMapping("/emp/update")
    public Employee updateEmployee(Employee employee ){
        employeeMapper.updateEmp(employee);
        return employee;
    }

}
