package com.wang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wang.dao.EmployeeMapper;
import com.wang.pojo.Employee;
import com.wang.service.EmployeeMapperService;

@Service
 
public class EmployeeMapperServiceImpl implements EmployeeMapperService{
	
	@Autowired
	private EmployeeMapper employeeMapper;
	@Transactional//标注事务注解
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return employeeMapper.deleteByPrimaryKey(id);
	}
	@Transactional// 
	public int insertSelective(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.insertSelective(employee);
	}

	public List<Employee> selectListAllEmployee() {
		// TODO Auto-generated method stub
		return employeeMapper.selectListAllEmployee();
	}

	public Employee selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return employeeMapper.selectByPrimaryKey(id);
	}
	@Transactional
	public int updateByPrimaryKeySelective(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.updateByPrimaryKeySelective(employee);
	}

}
