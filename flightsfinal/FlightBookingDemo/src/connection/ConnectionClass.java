package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionClass {
   public Connection setConnections() {
	   Connection connection=null;
	   try {
			//1.Connect
			//1.1 Register Driver
		   
			Class.forName("com.mysql.jdbc.Driver");
			//1.2 Connection to DB
			connection= DriverManager.getConnection("jdbc:mysql"+ "://localhost/mydb", "root", "shreya");
	   }
	   catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	return connection;
   }

public void closeConnection(Connection connection) {
	// TODO Auto-generated method stub
	try {
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
