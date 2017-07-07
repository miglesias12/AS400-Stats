package Databases;

import java.sql.*;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

public class ConnectMSQL {
	
	public static void main(String[] args) {
     
	// Declare the JDBC objects.

	Connection con = null;
	
	try {
		// Establish the connection. 
		SQLServerDataSource ds = new SQLServerDataSource();
		
		String url = "jdbc:sqlserver://192.168.70.39:1433";
		String user = "SA";
		String password ="Quality1";                                                     
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";	
		
		ds.setTrustServerCertificate(true);
	    ds.setAuthentication("SqlPassword");
		ds.setServerName("192.168.70.39");
		ds.setUser("customerintegrations");
		ds.setPassword("Quality1");
		ds.setPortNumber(1433); 
		ds.setDatabaseName("TFMP_CUSTOMER_INTEGRATIONS");
		
			
		con = ds.getConnection();
		     
			    
        }
        
	// Handle any errors that may have occurred.
    	catch (Exception e) {
    		e.printStackTrace();
    	}

      }
}
