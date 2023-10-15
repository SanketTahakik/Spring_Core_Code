package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	Student student = context.getBean("friststudent",Student.class);
    	
    	System.out.println(student);
    	student.study();
    
    }
}
