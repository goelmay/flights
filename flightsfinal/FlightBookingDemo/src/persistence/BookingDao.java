package persistence;

import entity.Bookings;

public interface BookingDao {
	public int bookFlight(int pnr, int userID, int flightID);
	public Bookings checkBookingStatus(int pnr);
}
