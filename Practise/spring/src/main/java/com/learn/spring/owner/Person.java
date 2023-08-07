package com.learn.spring.owner;

import com.learn.spring.generic.Vehicle;

public class Person {
	Vehicle vehicle;
	
	public Person(Vehicle b) {	
		vehicle = b;
	}
	
	public void drive() {
		int rate = vehicle.getRate();
		
		System.out.println("Rate of the vehicle is : "+rate);
	}
}