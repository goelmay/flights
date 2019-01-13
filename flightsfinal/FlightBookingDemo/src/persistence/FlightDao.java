package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.PreparedStatement;

import entity.Bookings;
import entity.Flights;
import entity.UserDetails;
import entity.TravelItenary;
public interface FlightDao {
	public ArrayList<TravelItenary> getFlightDetails(String source, String destination, String dateOfTravel);
}