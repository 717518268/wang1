package com.wang.dao;

import com.wang.pojo.Employee;

 
import java.util.List;
 
/**
 * mapper层
 * @author Administrator
 *
 */
public interface EmployeeMapper {
    
    public int deleteByPrimaryKey(Integer id);
    
    public  int insertSelective(Employee employee);

    
     /**查询全部**/
    public List<Employee> selectListAllEmployee();
    
    /**
     *	根据id查询返回一条数据
     * @param id
     * @return
     */
    public Employee selectByPrimaryKey(Integer id);

   
    /**
     * 根据id修改其他字段
     * @param employee
     * @return
     */
    public int updateByPrimaryKeySelective(Employee employee);
}