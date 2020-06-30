package com.wang.service.util;

import com.wang.service.exception.EmployeeException;
import com.wang.service.exception.EmployeeExceptionMessage;

public class EmployeeUtilsMessage {
	
	
	public static   boolean Namefalg(String name){
		if(name!=null){
			boolean falgname=name.length()>0&&name.length()<50;
			return falgname;
		}else{
			return false;
		}
		
		 
	}
	
	public static  boolean Ageflag(int age){
		if(age>0||age<150){
			return true;
		}else{
			System.out.println("失败。。。。");
			return false;
		}
	}
	
	public static  boolean Sexfalg(String sex){
		if(sex!=null){
			boolean sexfalg=sex.equals("男")||sex.equals("女");
			return sexfalg;
		}else{
			return false;
		}
	}
	public static  boolean Addressfalg(String address){
		if(address!=null){
			boolean falgAddress=address.length()>0&&address.length()<100;
			return falgAddress;
		}else{
			return false;
		}
		
		 
	}
	public static boolean AdveMeaageValue(String name,int age,String sex,String address) throws EmployeeExceptionMessage{
		boolean falgmessgae = false;
		if(!Namefalg(name)){
			falgmessgae=false;
			throw new EmployeeExceptionMessage("姓名格式不符合长度不能等于0或者不能超过50 the name---length not max<50 =====>min!=0"+falgmessgae);
		}else if(!Ageflag(age)){
			falgmessgae=false;
			throw new EmployeeExceptionMessage("年龄不能等于0或者不能超过130 the age---value not max<100 =====>min!=0"+falgmessgae);
		}else if(!Sexfalg(sex)){
			falgmessgae=false;
			throw new EmployeeExceptionMessage("性别只能是男或者女生====》message sex value  ===男&女"+falgmessgae);
		}else if(!Addressfalg(address)){
			falgmessgae=false;
			throw new EmployeeExceptionMessage("地址格式不符合长度不能等于0或者不能超过100 the name---length not max<100 =====>min!=0"+falgmessgae);
		}else{
			falgmessgae=true;
			return falgmessgae;
		}
		
		 
		
		
	}
	
}
