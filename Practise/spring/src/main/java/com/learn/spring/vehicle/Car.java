package com.learn.spring.vehicle;

import com.learn.spring.generic.Vehicle;

public class Car implements Vehicle{
	public int rate;
	
	public Car(int r) {
		rate = r;
	}
	
	public int getRate() {
		return rate;
	}
	
	public String toString() {
		return "Car - "+getRate();
	}
	
}
