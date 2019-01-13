package presentation;


import java.util.Date;
import java.util.Date.*;
import java.util.Scanner;

import entity.UserDetails;
import service.FlightServiceImpl;
public class UserInterfaceImpl implements UserInterface {

	@Override
	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Get Flight Details");
		System.out.println("2. Check your Iternary");
		System.out.println("3. Book a Flight");
		System.out.println("4. Exit");
	}

	@Override
	public void perform(int choice) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FlightServiceImpl flights = new FlightServiceImpl();
		switch(choice){
		case 1:
			System.out.println("Flying From:");
			String source = sc.next();
			System.out.println("Flying To:");
			String destination = sc.next();
			System.out.println("Date of Travel(yyyy-MM-dd):");
			String travelDate = sc.next();
			flights.getAllFlights(source, destination, travelDate);
			break;
		case 2:
			System.out.println("Enter your PNR number");
			int pnr = sc.nextInt();
			flights.getIternary(pnr);
			break;
		case 3:
			System.out.println("Enter User Details :");
			System.out.println("Enter User Id :");
			int userID = sc.nextInt();
			System.out.println("Enter Flight Id:");
			int flightID = sc.nextInt();
		    flights.bookFlight(userID, flightID);
			break;
		case 4:
			System.out.println("Thanks for Visiting, Good Bye !!");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
