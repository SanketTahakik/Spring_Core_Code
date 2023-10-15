package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Samosa s1 = (Samosa) context.getBean("s1");
    	
    	System.out.println(s1);
    	context.registerShutdownHook();
    	
    	System.out.println("----------------------------------------");
    	
    	Pepsi p1 = (Pepsi) context.getBean("p1");
    	System.out.println(p1);
    	
    	System.out.println("-----------------------------------------");
    	
    	Vadapav vada = (Vadapav) context.getBean("vada");
    	
    	System.out.println(vada);
    }
}
