package com.tekandco.jdbc.selectrecords;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tekandco.jdbc.JDBCMain;
import com.tekandco.jdbc.model.Student;

public class SelectStudentRecords extends Student{

	public List<Student> selectStudentRecords() throws Exception{
		
		List<Student> studentList = new ArrayList<>();
		//Get JDBC Connection
		Connection con = JDBCMain.getConnection();
		
		if(con==null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		
		String query = "SELECT * FROM students;";
		
		//Statement is used to here because we are fetching all records
		Statement stmt = con.createStatement();
		

		
		//ExecuteQuery function is generally used for select statements and returns a
		//resultset which is a list of all records that were selected
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			Student student = new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setMarks(rs.getDouble("marks"));
			studentList.add(student);
		}
		stmt.close();
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		return studentList;
		
	}

}
