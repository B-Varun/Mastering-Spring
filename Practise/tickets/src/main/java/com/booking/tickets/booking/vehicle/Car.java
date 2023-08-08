package com.booking.tickets.booking.vehicle;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Car extends Vehicle{
	public void bookVehicle() {
		System.out.println("Car Booked");
	}
}
