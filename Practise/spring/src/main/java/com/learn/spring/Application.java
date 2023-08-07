package com.learn.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.spring.config.VehicleConfiguration;
import com.learn.spring.generic.Vehicle;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(VehicleConfiguration.class);
		
		System.out.println("All bean definitions : ");
		
		for(String s : context.getBeanDefinitionNames())
			System.out.println(s);
		
		System.out.println("\n\n\n\n\n");
		
		
		
		Vehicle v = (Vehicle)context.getBean(Vehicle.class);
		
		System.out.println("Vehicle is : "+v);
		
		
		System.out.println("Rate of the vehicle is : "+v.getRate());
	}

}
