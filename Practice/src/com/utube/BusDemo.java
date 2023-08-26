package com.utube;

import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo 
{
public static void main(String[] args) {
	ArrayList<Bus> buses = new ArrayList<Bus>();
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	
	
	buses.add(new Bus(1,true,20));
	buses.add(new Bus(2,false,30));
	buses.add(new Bus(3,true,40));
	
	
	int userin=1;
	Scanner scan=new Scanner(System.in);
	
	for(Bus b : buses) {
		b.displayBusInfo();
	}
	
	while(userin==1)
	{
		System.out.println("Enter 1 to book and 2 to exit");
		userin = scan.nextInt();
		if(userin==1) {
			System.out.println("booking");
			Booking booking = new Booking();
			
		}
	}
}	
}