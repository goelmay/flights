package persistence;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionClass;
import entity.TravelItenary;

public class FlightDaoImpl implements FlightDao {

	@Override
	public ArrayList<TravelItenary> getFlightDetails(String source, String destination, String dateOfTravel) {
		// TODO Auto-generated method stub
		ArrayList<TravelItenary> list = new ArrayList<TravelItenary>();
		ConnectionClass con = new ConnectionClass();
		Connection connection = con.setConnections();
		try {
			PreparedStatement pStatement = connection.prepareStatement("SELECT * FROM TRAVEL WHERE SOURCE=? AND DESTINATION=? AND DATE=?");
			pStatement.setString(1, source);
			pStatement.setString(2, destination);
			pStatement.setString(3, dateOfTravel);
			ResultSet resultset=pStatement.executeQuery();
			TravelItenary detail = null;
			while(resultset.next()){
				detail = new TravelItenary();
				detail.setFlightID(resultset.getInt("FLIGHT_ID"));
				detail.setSource(resultset.getString("SOURCE"));
				detail.setDestination(resultset.getString("DESTINATION"));
				detail.setDateOfTravel(resultset.getString("DATEOFTRAVEL"));
				list.add(detail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			con.closeConnection(connection);
		}
		return list;
	}
}
