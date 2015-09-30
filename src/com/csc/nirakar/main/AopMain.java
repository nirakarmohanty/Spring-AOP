package com.csc.nirakar.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.nirakar.bean.Employee;


public class AopMain {
	
	public static void main(String args[]){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aop.xml");
		Employee e = (Employee) ctx.getBean("employee");
		e.getAddress().setAddress("Odisha");
		System.out.println(e.getId() + " : "+ e.getName() +" : " + e.getAddress().getAddress());
		
		
	}

}
