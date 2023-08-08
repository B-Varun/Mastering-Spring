package com.booking.tickets;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.booking.tickets.booking.TicketBookingMachine;

@ComponentScan
public class TicketsApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TicketsApplication.class);
		
		((TicketBookingMachine)context.getBean(TicketBookingMachine.class)).book();		
	}

}
