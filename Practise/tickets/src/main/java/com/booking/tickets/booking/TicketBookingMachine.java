package com.booking.tickets.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.booking.tickets.booking.vehicle.Vehicle;

@Component
public class TicketBookingMachine {

	@Autowired
	@Qualifier("fasterTravel")
	Vehicle vehicle;
	
	public void book() {
		vehicle.bookVehicle();
	}
}
