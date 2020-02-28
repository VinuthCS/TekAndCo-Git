package com.tekandco.jdbc.createtables;

/**
 * This class creates a Student Table with 3 columns
 * student.id -> Integer
 * student.name -> VarChar(30)
 * student.marks -> Double
 * 
 * We use Statement Class here because the query is Fixed
 */

import java.sql.Connection;
import java.sql.Statement;

import com.tekandco.jdbc.JDBCMain;

public class CreateStudents {
	
	public void createStudentsTable() throws Exception{
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		String query = "CREATE TABLE students(id INTEGER NOT NULL AUTO_INCREMENT,"
											+ "name VARCHAR(30) NOT NULL,"
											+ "marks DOUBLE,"
											+ "PRIMARY KEY (id)"
											+ ");";
		
		//Statement is used to execute Static/Fixed SQL queries
		Statement stmt = con.createStatement();
		
		//Execute function returns true if the query returns a resultset  
		stmt.execute(query);
		stmt.close();
		
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		
	}

}
