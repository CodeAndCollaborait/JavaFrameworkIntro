package com.designpattern.JavaDesignPattern;

import com.designpattern.JavaDesignPattern.IntroToSpring.ApplicationConfig;
import com.designpattern.JavaDesignPattern.IntroToSpring.SendMessage;
import com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern.IntroToFactory;
import com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern.Vehicle;
import com.designpattern.JavaDesignPattern.designPattern.SingletonIntro;
import com.designpattern.JavaDesignPattern.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
	  
	  AnnotationConfigApplicationContext context
			  = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	  
	  SendMessage message = context.getBean(SendMessage.class);
	  System.out.println(message.hashCode());
	  System.out.println(message.getMessage());
	  
	  message.setMessage("Some other message");
	  System.out.println(message.getMessage());
	  System.out.println(message.hashCode());
	  SpringApplication.run(JavaDesignPatternApplication.class, args);


		// ----------------- IntroToFactory demo ---------------------

		//
		IntroToFactory vehicleFactory = new IntroToFactory();

		// get an object of Motorcycle
		Vehicle motorcycle = vehicleFactory.getVehicle("Motorcycle");
		motorcycle.vehicleInfo();		// call Motorcycle's vehicleInfo method

		// get an object of Truck
		Vehicle truck = vehicleFactory.getVehicle("truck");
		truck.vehicleInfo();		// call Truck's vehicleInfo method

		// get an object of Automobile
		Vehicle automobile = vehicleFactory.getVehicle("Automobile");
		automobile.vehicleInfo();		// call Automobile's vehicleInfo method 
	}

}
