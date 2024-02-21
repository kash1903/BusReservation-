package BusResv;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import BusResv.Booking;
import BusResv.Bus;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		BusDAO busdao= new BusDAO();
		busdao.displayBusInfo();
		
		
		// ArrayList // Collections
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
	buses.add( new Bus(1,true,2));
	buses.add( new Bus(2,false,45));
	buses.add( new Bus(3,true,48));
		
		int UserOpt=1;
		Scanner sc= new Scanner (System.in);
		while(UserOpt==1) {
			System.out.println("Enter 1 for booking and 2 to exit");
			UserOpt=sc.nextInt();
			if(UserOpt == 1	) {
				Booking booking = new Booking();
				if(booking.isAvailabe()	) {
			         BookingDAO bookingdao= new BookingDAO();
			         bookingdao.addBooking(booking);
			         
					System.out.println(" Your Booking is Confirmed ");
					
					
				}
				else {
					System.out.println("Sorry Bus is full try another Bus or Date ");
				}
			}
			//sc.close();
		}

	}
}

	


