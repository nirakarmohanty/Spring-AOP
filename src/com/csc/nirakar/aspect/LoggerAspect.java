package com.csc.nirakar.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


/**This is a Demo class which is called as an ASPECT
 * Methods are called Advise
 * @author nmohanty
 *
 */
@Aspect
public class LoggerAspect {
	
	/** Executes all "public String getName()" method present in Bean.
	 * This method is can be treated as an advice which will be getting called before getName method
	*/
	@Before("execution(public String getName())")
	public void displayLoggerForgetName(){
		System.out.println("Logger is called from here");
	}
	
	// Executes all methods which are started with get*
	@Before("execution(public String get*())")
	public void displayLoggerForAllget(){
		System.out.println("Logger is called from here");
	}
	
	//Executes package Specific method i.e for a specific Class
	@Before("execution(public String com.csc.nirakar.bean.Employee.getName())")
	public void displayLoggerForSpecificPackage(){
		System.out.println("Logger is called from here");
	}
	
	
	public void loggingAdvice(){
		
	}
	
	
}
