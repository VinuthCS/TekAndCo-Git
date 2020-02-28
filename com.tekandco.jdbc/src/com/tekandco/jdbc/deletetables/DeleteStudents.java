package com.tekandco.jdbc.deletetables;

import java.sql.Connection;
import java.sql.Statement;

import com.tekandco.jdbc.JDBCMain;

public class DeleteStudents {
	public void deleteStudentsTable() throws Exception{
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		String query = "DROP TABLE students;";
		
		//Statement is used to execute Static/Fixed SQL queries
		Statement stmt = con.createStatement();
		
		//Execute function returns true if the query returns a resultset  
		stmt.execute(query);
		stmt.close();
		
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		
	}
}
