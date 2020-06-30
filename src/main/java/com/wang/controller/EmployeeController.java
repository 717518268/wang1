package com.wang.controller;

 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wang.pojo.Employee;
import com.wang.service.EmployeeMapperService;
import com.wang.service.exception.EmployeeException;
import com.wang.service.exception.EmployeeExceptionMessage;
import com.wang.service.util.EmployeeUtilsMessage;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeMapperService employeeMapperService;
	public static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	public static final int SUCCESS=1;//代表成功
	public static final int ERROR=0;//代表失败
	/**
	 * 插入数据回显id
	 * @return
	 * @throws EmployeeException 
	 * @throws EmployeeExceptionMessage 
	 */
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	@ResponseBody
	public int inser() throws EmployeeException, EmployeeExceptionMessage{
		String name="张三风";
		int age=18;
		String sex="男";
		String address="北京";
		boolean confag=EmployeeUtilsMessage.AdveMeaageValue(name, age, sex, address);
		/**校验一次   */
		if( confag){
			Employee employee=new Employee();
			employee.setName(name);
			employee.setAge(age);
			employee.setSex(sex);
			employee.setAddress(address);
			int index=employeeMapperService.insertSelective(employee);
			if(index>0){
				return SUCCESS;
			}else{
				throw new EmployeeException("服务器失败");
			}
		}else{
			return ERROR;
		}
		
		 
	}
	
	/**
	 * 根据id查询
	 * @return
	 * @throws EmployeeException
	 */
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ResponseBody
	public Employee getEmployeeid() throws EmployeeException{
		
		Employee employee=employeeMapperService.selectByPrimaryKey(3);
		if(employee!=null){
			return employee;
		}else{
			 
			throw new EmployeeException("没有此id对应的数据");
			
		}
		 
	}
	
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	@ResponseBody
	public Employee updateEmployee() throws EmployeeExceptionMessage, EmployeeException{
		Employee employee=employeeMapperService.selectByPrimaryKey(3);
		/**先查  **/
		if(employee!=null){
			String name="张三风";
			int age=28;
			String sex="男";
			String address="北京";
			boolean confag=EmployeeUtilsMessage.AdveMeaageValue(name, age, sex, address);//进行校验
			 
			if(confag){
				employee.setName(name);
				employee.setAge(age);
				employee.setSex(sex);
				employee.setAddress(address);
				int index=employeeMapperService.updateByPrimaryKeySelective(employee);//进行修改
				if(index>0){
					return employee;
				}else{
					throw new EmployeeException("修改出错！！！");
				}
			}
		}else{
			throw new EmployeeException("没有此id对应的数据");
		}
		    
	 
		return employee;
		
		
	}
	
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	@ResponseBody
	public int deleteEmployee() throws EmployeeException{
		int id=2;
		int indexdelete=employeeMapperService.deleteByPrimaryKey(id);
		if(indexdelete>0){
			return SUCCESS;
		}else{
			throw new EmployeeException("没有此id对应的数据=====删除失败 ===》remove error");
		}
		 
		
		
	}
	
	
}
