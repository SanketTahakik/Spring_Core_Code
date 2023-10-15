package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student student = context.getBean("student",Student.class);
    	
//    	System.out.println(student);
//    	
//    	System.out.println(student.getAddress());
    	
//    	video 24
    	
    	System.out.println(student.hashCode());
    	Student student2 = context.getBean("student",Student.class);
    	System.out.println(student.hashCode());
    }
}
