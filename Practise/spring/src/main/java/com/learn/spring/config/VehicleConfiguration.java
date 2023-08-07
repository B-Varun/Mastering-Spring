package com.learn.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learn.spring.generic.Vehicle;
import com.learn.spring.vehicle.Aeroplane;
import com.learn.spring.vehicle.Bike;
import com.learn.spring.vehicle.Bus;
import com.learn.spring.vehicle.Car;

@Configuration
public class VehicleConfiguration {

	@Bean
	public Vehicle getCar() {
		return new Car(800);
//		return new Bike(100);
//		return new Aeroplane(100000);
//		return new Bus(1000);
		
	}
	
	@Bean
	public Vehicle getBike() {
		return new Bike(100);
	}
	
	@Bean
	@Primary
	public Vehicle getPlane() {
		return new Aeroplane(100000);
	}
	
	@Bean
	public Vehicle getBus() {
		return new Bus(1000);
	}
	
	
}
