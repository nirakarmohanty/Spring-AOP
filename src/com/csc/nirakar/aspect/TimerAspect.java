package com.csc.nirakar.aspect;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * This class can be used as a Aspect for printing the DD-MM-YYY- HH-MM-SS
 * basicall time format
 * 
 * @author nmohanty
 * 
 */
@Aspect
public class TimerAspect {

	Date date = new Date();

	/********************************************************************************
	 * If you have a lot of methods to execute for a particular point of method
	 * , you can configure with Point cut. Point cut means , Point where the
	 * method will be cut in . For example "execution(* get*(..))" is a point cut for 
	 * printCurrentTime and printCurrentTimeasHour method.
	 *********************************************************************************/
	//*************************Methods without Pointcut annotation******************************************
	/**
	@Before("execution(* get*(..))")
	public void printCurrentTime() {
		System.out.println(date.toString());
	}

	@Before("execution(* get*(..))")
	public void printCurrentTimeasHour() {
		System.out.println(date.getHours());
	}
	**/
	//*****************************Method with PointCut Annotation**************************************
	@Before("allGetter()")
	public void printCurrentTime() {
		System.out.println(date.toString());
	}

	@Before("allGetter()")
	public void printCurrentTimeasHour() {
		System.out.println(date.getHours());
	}
	// So above configuration can be defined as below 
	@Pointcut("execution(* get*(..))")
	public void allGetter(){}
}
