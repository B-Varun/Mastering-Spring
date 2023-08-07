package com.learn.spring.vehicle;

import com.learn.spring.generic.Vehicle;

public class Bike  implements Vehicle{
	public int rate;
	
	public Bike(int r) {
		rate = r;
	}
	
	public int getRate() {
		return rate;
	}
	
	public String toString() {
		return "Bike - "+getRate();
	}
	
}
