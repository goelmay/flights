package service;

import java.util.ArrayList;

import entity.Bookings;
import entity.Flights;
import entity.TravelItenary;
import persistence.BookingDaoImpl;
import persistence.FlightDaoImpl;
import persistence.UserDaoImpl;

public class FlightServiceImpl implements FlightService {
	
	BookingDaoImpl booking = new BookingDaoImpl();
	FlightDaoImpl flight = new FlightDaoImpl();
	UserDaoImpl user = new UserDaoImpl();
	@Override
	public ArrayList<TravelItenary> getAllFlights(String source, String destination, String dateOfTravel) {
		// TODO Auto-generated method stub
		return flight.getFlightDetails(source, destination, dateOfTravel);
	}

	@Override
	public Bookings getIternary(int pnr) {
		// TODO Auto-generated method stub
		return booking.checkBookingStatus(pnr);
	}

	@Override
	public void bookFlight(int userId, int flightID) {
		// TODO Auto-generated method stub
		RandomNumberGeneration id = new RandomNumberGeneration();
		booking.bookFlight(id.generate(), userId, flightID);
	}

}
