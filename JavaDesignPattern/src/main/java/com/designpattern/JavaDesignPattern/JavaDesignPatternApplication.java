package com.designpattern.JavaDesignPattern;

import com.designpattern.JavaDesignPattern.DI.MessageService;
import com.designpattern.JavaDesignPattern.DI.SpringDI_Intro;
import com.designpattern.JavaDesignPattern.IntroToSpring.ApplicationConfig;
import com.designpattern.JavaDesignPattern.IntroToSpring.SendMessage;
import com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern.IntroToFactory;
import com.designpattern.JavaDesignPattern.designPattern.Factory_Pattern.Vehicle;
import com.designpattern.JavaDesignPattern.designPattern.SingletonIntro;
import com.designpattern.JavaDesignPattern.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;
import java.util.Scanner;

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
	  
	  
	  
	  
//	  context = new AnnotationConfigApplicationContext(SpringDI_Intro.class);
//	  MessageService messageService = context.getBean(MessageService.class);
//	  messageService.sendMessage("This is my text message");
//

		// ----------------- IntroToFactory demo ---------------------

		String type = "";
		String companyName = "";
		String model = "";
		String power = "";
		String color = "";

		System.out.println("Enter car type : ");
		Scanner scanner = new Scanner(System.in);
		type = scanner.nextLine();

		System.out.println("Enter company name :");
		companyName = scanner.nextLine();

		System.out.println("Enter car model : ");
		model = scanner.nextLine();
//		//
		IntroToFactory vehicleFactory = new IntroToFactory();

		// get an object of Motorcycle
		Vehicle motorcycle = vehicleFactory.getVehicle("Motorcycle");
		motorcycle.vehicleInfo();// call Motorcycle's vehicleInfo method

		System.out.println("Enter car power : ");
		power = scanner.nextLine();

		System.out.println("Enter car color : ");
		color = scanner.nextLine();

		/*type = JOptionPane.showInputDialog("Enter Car type : ");
		companyName = JOptionPane.showInputDialog("Enter company name");
		model = JOptionPane.showInputDialog("Enter car model ");
		power = JOptionPane.showInputDialog("Enter car power ");
		color = JOptionPane.showInputDialog("Enter car color ");*/

		//
		IntroToFactory vehicleFactory = new IntroToFactory();
		Vehicle carType = vehicleFactory.getVehicle(type,companyName,model,power,color);
		carType.vehicleInfo();
		System.out.println("Car description \n" + carType);
		// get an object of Automobile
		Vehicle automobile = vehicleFactory.getVehicle("Automobile");
		automobile.vehicleInfo();		// call Automobile's vehicleInfo method
	}

}
