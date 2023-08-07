package com.learn.spring.vehicle;

import com.learn.spring.generic.Vehicle;

public class Bus  implements Vehicle{

	public int rate;
	
	public Bus(int r) {
		rate = r;
	}
	
	public int getRate() {
		return rate;
	}
	
	public String toString() {
		return "Bike - "+getRate();
	}
	
}
