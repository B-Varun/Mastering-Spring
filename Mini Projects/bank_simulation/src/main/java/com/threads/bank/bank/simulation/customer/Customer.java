package com.threads.bank.bank.simulation.customer;

public class Customer {

	private int serviceTime;
	public String customerName;
	
	public Customer(int time, String name) {
		serviceTime = time;
		customerName = name;
	}
	
	public int getServiceTime() {
		return serviceTime;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String toString() {
		return customerName+", Service Time : "+serviceTime+" secs";
	}
}
