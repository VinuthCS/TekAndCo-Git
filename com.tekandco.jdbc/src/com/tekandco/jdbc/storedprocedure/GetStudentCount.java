package com.tekandco.jdbc.storedprocedure;

import java.sql.Connection;

import com.mysql.cj.MysqlType;
import com.mysql.cj.jdbc.CallableStatement;
import com.tekandco.jdbc.JDBCMain;

public class GetStudentCount {
	public static int getRecordCount() throws Exception {

		// Get JDBC Connection
		Connection con = JDBCMain.getConnection();

		if (con == null) {
			Exception e = new Exception("Unable to Establish Connection to database");
			throw e;
		}
		// ? is used as a place holder/positional for the output parameter
		String query = "{CALL get_student_count(?)}";
		
		//Callable Statement is used to support procedure
		CallableStatement stmt = (CallableStatement) con.prepareCall(query);
		
		stmt.execute();
		int count = stmt.getInt(1);
		stmt.close();
		//Close JDBC Connection
		JDBCMain.closeConnection(con);
		return count;

	}
}
