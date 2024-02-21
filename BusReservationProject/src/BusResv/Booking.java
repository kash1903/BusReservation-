package BusResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import BusResv.Booking;
import BusResv.Bus;

public class Booking {
	
	String passengerName;
	int busNo;
	Date date;

Booking(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Passengers Name : ");
	passengerName=sc.next();
	System.out.println("Enter Bus Number : ");
	busNo=sc.nextInt();
	System.out.println("Enter Date dd-mm-yyyy :");
	
	String dateInput=sc.next()	;
	SimpleDateFormat DateFormat= new SimpleDateFormat("dd-MM-yyyy");
	
	try {
		date=DateFormat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

   
public boolean isAvailabe() throws SQLException {
	// TODO Auto-generated method stub
	
	
	BusDAO busdao= new BusDAO();
	BookingDAO bookingdao= new BookingDAO();
	
	int capacity=busdao.getCapacity(busNo);
	

		int booked=bookingdao.getBookedCount(busNo,date);
	
		//return booked < capacity ? true:false;
		return booked < capacity;
			
		}

}
