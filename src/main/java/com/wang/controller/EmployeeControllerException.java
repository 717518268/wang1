package com.wang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class EmployeeControllerException {
	
	/**
	 * 全局异常
	 * com.wang.service.exception.EmployeeException
	 * 该方法需要返回一个ModelAndView：目的是可以让我们封装异常信息以及视图的指定
	 * 参数Exception e:会将产生异常对象注入到方法中
	 */
	@ExceptionHandler(value={com.wang.service.exception.EmployeeException.class})
	public ModelAndView nullPointerExceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		 
		mv.addObject("error", e.toString());
		mv.setViewName("500");
		return mv;
	}
}
