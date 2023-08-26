package com.utube;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Booking {
	String passengerName;
	int busNo;
	Date d;
	
	Booking(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		passengerName = scan.next();
		System.out.println("Enter your Bus No:");
		busNo = scan.nextInt();
		System.out.println("Enter Date");
		String DateStr = scan.next();
		SimpleDateFormat dateFor = new SimpleDateFormat("dd-MM-yyyy");
		try {
			d=dateFor.parse(DateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
