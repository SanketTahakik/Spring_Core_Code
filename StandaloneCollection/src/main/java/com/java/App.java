package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world");
		
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		
		Person per = con.getBean("person1",Person.class);
		
		System.out.println(per1);
		System.out.println(per1.getFriends().getClass().getName());
		
		System.out.println("------------------------------");
		System.out.println(per1.getfeestructure());
		System.out.println(per1.getfeestructure().getClass().getName());
	}

}
