package Databases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AS400SQL {
	
	    Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
	 
		String url = "jdbc:as400://192.168.10.220:8471/DEVTEST2";
	    String user = "PEGASUS";
	    String password ="PEGASUS";                                                     
	    String driverName = "com.ibm.as400.access.AS400JDBCDriver";	
	    String SQLstmt;
	    
	   void AS400SQLCon() {

			try {
				
				//Connect to AS400
				con = DriverManager.getConnection(url, user, password);
				
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

	    }
	   
	   void AS400SQLexec(){
		   
		   try {
			   stmt = con.createStatement();
			   rs = stmt.executeQuery(SQLstmt);
			   
			   
			   while (rs.next()) {
       			System.out.println(rs.getString("DIVISION_ID"));
       		}
			   
			   
		   		} catch (SQLException e) {
		   				// TODO Auto-generated catch block
		   				e.printStackTrace();
		   				}
   		
	   }
	    
	   
 }
	  
	
