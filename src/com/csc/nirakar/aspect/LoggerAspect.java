package com.csc.nirakar.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggerAspect {
	
	// Executes all "public String getName()" method present in Bean
	@Before("execution(public String getName())")
	public void displayLoggerForgetName(){
		System.out.println("Logger is called from here");
	}
	
	// Executes all methods which are started with get*
	@Before("execution(public String get*())")
	public void displayLoggerForAllget(){
		System.out.println("Logger is called from here");
	}
	
	//Executes package Specific method
	@Before("execution(public String com.csc.nirakar.bean.Employee.getName())")
	public void displayLoggerForSpecificPackage(){
		System.out.println("Logger is called from here");
	}
	
	
}
