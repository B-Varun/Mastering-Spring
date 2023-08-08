package com.booking.tickets.booking.vehicle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("fasterTravel")
@Component
public class Flight extends Vehicle {
	public void bookVehicle() {
		System.out.println("Flight Booked");
	}
}
