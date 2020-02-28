package com.tekandco.jdbc.updaterecord;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tekandco.jdbc.JDBCMain;
import com.tekandco.jdbc.model.Student;

public class UpdateStudentRecord extends Student{
	
	public void updateStudentRecord() throws Exception{
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		// ? is used as a place holder/positional parameter to insert values dynamically
		String query = "UPDATE students SET name = ?, marks = ? where id = ?;";
		
		//Prepared Statement is used to support dynamic data binding
		PreparedStatement stmt = con.prepareStatement(query);
		
		//we use stmt.set to set the values to parameter index from the query
		stmt.setString(1, super.getName());
		stmt.setDouble(2, super.getMarks());
		stmt.setInt(3, super.getId());
		
		//ExecuteUpdate function is generally used make database updates
		//and returns the number of rows affected
		stmt.executeUpdate();
		stmt.close();
		
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		
	}

}
