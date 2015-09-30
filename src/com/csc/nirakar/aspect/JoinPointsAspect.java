package com.csc.nirakar.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/** Let say I have a Point cut which will executes advice for All Methods in Address class . 
 * But I need to print the console messages differently for Getter and Setter . 
 * @author nmohanty
 *
 */
@Aspect
public class JoinPointsAspect {
	/**
	@Before("allAddressMethods()")
	public void aspectJoinPoints(){
		System.out.println("JoinPoints Aspect Example -- Running");
	}
	
	@Pointcut("within(com.csc.nirakar.bean.Address)")
	public void allAddressMethods(){}
     */
	//********************NOW IMPLEMENT THE JOIN POINTS *********************
	//By Passing the argument @JoinPoint in the Advice method you can get to know  which method is called
	@Before("allAddressMethods()")
	public void aspectJoinPoints(JoinPoint joinpoint){
		System.out.println(joinpoint.toString());
	}
	
	@Pointcut("within(com.csc.nirakar.bean.Address)")
	public void allAddressMethods(){}
	
	@Before("args(String)")
	public void setterMethodClled(){
		System.out.println("Setter method called ");
	}
	
}
