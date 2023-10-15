package com.java;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Demo d1 = context.getBean("demo",Demo.class);
    	System.out.println(d1);
    	
    	
    	SpelExpressionParser temp = new SpelExpressionParser() ;
    	Expression expression = (Expression) temp.parseExpression("22 + 44");
    	System.out.println(expression.getValue());
    }
}
