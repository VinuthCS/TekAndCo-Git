package com.tekandco.jdbc.deleterecords;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tekandco.jdbc.JDBCMain;
import com.tekandco.jdbc.model.Student;

public class DeleteStudentRecord extends Student{
	
	public void deleteStudentRecord() throws Exception{
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		// ? is used as a place holder/positional parameter to delete values dynamically
		String query = "DELETE FROM students where id = ?;";
		
		//Prepared Statement is used to support dynamic data binding
		PreparedStatement stmt = con.prepareStatement(query);
		
		//we use stmt.set to set the values to parameter index from the query
		stmt.setInt(1, super.getId());
		
		//ExecuteUpdate function is generally used make database updates
		//and returns the number of rows affected
		stmt.executeUpdate();
		stmt.close();
		
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		
	}

}
