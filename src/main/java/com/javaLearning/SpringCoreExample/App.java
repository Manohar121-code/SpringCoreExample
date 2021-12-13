package com.javaLearning.SpringCoreExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaLearning.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
    	Employee e1 = (Employee) appContext.getBean("employee1");
    	System.out.println(e1);
    	
    	Employee e2 = (Employee) appContext.getBean("employee1");
    	System.out.println(e2);
    	
    	System.out.println(e1 == e2);
    	
    	System.out.println("------------------------------");
    	
    	Employee e3 = (Employee) appContext.getBean("employee2");
    	
    	Employee e4 = (Employee) appContext.getBean("employee2");
    	
    	System.out.println(e3);
    	System.out.println(e4);
    	
    	System.out.println("----------------------");
    	
    	Employee e5 = (Employee) appContext.getBean("employee3");
    	System.out.println(e5);
    }
}
