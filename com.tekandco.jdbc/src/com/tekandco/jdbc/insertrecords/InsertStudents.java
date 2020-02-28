package com.tekandco.jdbc.insertrecords;

/**
 * In this class, we initialize the parameters id, name and marks using a constructor
 * and pass these values to a PreparedStatement to insert records into students table
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tekandco.jdbc.JDBCMain;
import com.tekandco.jdbc.model.Student;

public class InsertStudents extends Student{

	public void insertStudentRecord() throws Exception{
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		// ? is used as a place holder/positional parameter to insert values dynamically
		String query = "INSERT INTO students VALUES (?, ?,?);";
		
		//Prepared Statement is used to support dynamic data binding
		PreparedStatement stmt = con.prepareStatement(query);
		
		//we use stmt.set to set the values to parameter index from the query
		stmt.setInt(1, super.getId());
		stmt.setString(2, super.getName());
		stmt.setDouble(3, super.getMarks());
		
		//ExecuteUpdate function is generally used make database updates
		//and returns the number of rows affected
		stmt.executeUpdate();
		stmt.close();
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		
	}

}
