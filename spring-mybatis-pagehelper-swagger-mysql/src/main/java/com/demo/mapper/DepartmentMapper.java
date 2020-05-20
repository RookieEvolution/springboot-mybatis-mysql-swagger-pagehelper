package com.demo.mapper;


import com.demo.javaBean.Department;
import org.apache.ibatis.annotations.*;
/*
* 注解版
* */
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDepartmentId(int id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(int id);

    @Insert("insert into department (departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
