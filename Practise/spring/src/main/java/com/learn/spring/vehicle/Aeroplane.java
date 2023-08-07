package com.learn.spring.vehicle;

import com.learn.spring.generic.Vehicle;

public class Aeroplane implements Vehicle{

	public int rate;
	
	public Aeroplane(int r) {
		rate = r;
	}
	
	public int getRate() {
		return rate;
	}
	
	public String toString() {
		return "AeroPlane - "+getRate();
	}
	
}
