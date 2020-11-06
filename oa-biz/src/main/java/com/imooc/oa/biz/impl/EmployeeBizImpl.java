package com.imooc.oa.biz.impl;

import com.imooc.oa.biz.EmployeeBiz;
import com.imooc.oa.dao.EmployeeDao;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {

    @Autowired
    private EmployeeDao employeeDao;

    public void add(Employee employee) {

    }

    public void edit(Employee employee) {

    }

    public void remove(String sn) {

    }

    public Employee get(String sn) {
        return null;
    }

    public List<Employee> getAll() {
        return employeeDao.selectAll();
    }
}
