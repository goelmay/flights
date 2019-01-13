package service;

import java.util.ArrayList;

import entity.Bookings;
import entity.Flights;
import entity.TravelItenary;

public interface FlightService {
	public ArrayList<TravelItenary> getAllFlights(String source, String destination, String dateOfTravel);
	public Bookings getIternary(int pnr);
	public void bookFlight(int userId, int flightId);
}
