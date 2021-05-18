package com.designpattern.JavaDesignPattern;

import com.designpattern.JavaDesignPattern.designPattern.SingletonIntro;
import com.designpattern.JavaDesignPattern.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaDesignPatternApplication {

	public static void main(String[] args) {
	  Employee employee = new Employee();
	  employee.setId(101);
	  System.out.println(employee.getId());
	  Employee employee2 = new Employee();
	  employee2.setId(201);
	  System.out.println(employee2.getId());
	  System.out.println(employee.hashCode());
	  System.out.println(employee2.hashCode());
	  System.out.println(employee.equals(employee2));
	  
	  SingletonIntro intro = SingletonIntro.getInstance();
	  SingletonIntro intro2 = SingletonIntro.getInstance();
	  System.out.println(intro.hashCode());
	  System.out.println(intro2.hashCode());
	  System.out.println(intro.equals(intro2));
	  
		SpringApplication.run(JavaDesignPatternApplication.class, args);
	}

}
