package com.booking.tickets.booking.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Vehicle{
	public void bookVehicle() {
		System.out.println("Bus Booked");
	}
	
}
