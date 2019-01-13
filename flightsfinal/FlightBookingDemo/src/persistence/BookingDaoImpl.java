package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionClass;
import entity.Bookings;


public class BookingDaoImpl implements BookingDao {

	@Override
	public int bookFlight(int pnr ,int userID, int flightID) {
		ConnectionClass con = new ConnectionClass();
		Connection connection = con.setConnections();
		try {
		PreparedStatement pStatement = connection.prepareStatement("INSERT INTO BOOKING VALUES(?,?,?)");
		pStatement.setInt(1, pnr);
		pStatement.setInt(2, userID);
		pStatement.setInt(3, flightID);
		int rows=pStatement.executeUpdate();
		if(rows>0)
			return pnr;
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		con.closeConnection(connection);
	}
		return 0;
	}

	@Override
	public Bookings checkBookingStatus(int pnr) {
		ConnectionClass con = new ConnectionClass();
		Connection connection = con.setConnections();
		try {
			
			PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM BOOKING WHERE PNR=?");
			pStatement.setInt(1, pnr);
			ResultSet resultset=pStatement.executeQuery();
			Bookings booking = new Bookings();
			if(resultset.next()){
				booking.setPnr(pnr);
				booking.setTravelId(resultset.getInt("FLIGHT_ID"));
				booking.setUserId(resultset.getInt("USER_ID"));
			}
			return booking;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.closeConnection(connection);
		}
		return null;
	}

}
