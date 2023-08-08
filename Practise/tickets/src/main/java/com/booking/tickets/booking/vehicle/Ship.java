package com.booking.tickets.booking.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Ship extends Vehicle {
	public void bookVehicle() {
		System.out.println("Ship Booked");
	}
}
