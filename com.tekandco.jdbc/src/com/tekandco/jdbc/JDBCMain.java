package com.tekandco.jdbc;

/**
 * This class is used to demo JDBC Concepts and has a dependency on mysql-connector
 * -> Load Driver
 * -> Establish Connection
 * -> Create Table
 * -> Insert Records
 * -> Select Records
 * -> Update Records
 * -> Delete Records
 * -> Calling Stored Procedures
 * -> Close Connection
 * The use of Different Statements (Statement, PreparedStatement, CallableStatement)
 * can also be observed
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.tekandco.jdbc.createtables.CreateStudents;
import com.tekandco.jdbc.deleterecords.DeleteStudentRecord;
import com.tekandco.jdbc.deletetables.DeleteStudents;
import com.tekandco.jdbc.insertrecords.InsertStudents;
import com.tekandco.jdbc.model.Student;
import com.tekandco.jdbc.selectrecords.SelectStudentRecords;
import com.tekandco.jdbc.storedprocedure.GetStudentCount;
import com.tekandco.jdbc.updaterecord.UpdateStudentRecord;

public class JDBCMain {
	/**
	 * driver -> com.mysql.cj.jdbc.Driver server -> localhost port number -> 3306
	 * database name -> tek_and_co
	 */
	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/tek_and_co";
	static final String USERNAME = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {
		while (true) {
			System.out.println("******************************************************");
			System.out.println("What would u like to do:\n" + "1> Test DB Connection\n" + "2> Create Student Table\n"
					+ "3> Delete Student Table\n" + "4> Insert Student Records\n" + "5> Update Student Records\n"
					+ "6> Delete Student Records\n" + "7> Display Student Records\n"
					+ "8> Get Count of Student Records\n" + "9> Exit");
			Scanner input = new Scanner(System.in);
			int ch = Integer.parseInt(input.nextLine());
			switch (ch) {
			case 1:
				performTest();
				break;
			case 2:
				createStudentTable();
				break;
			case 3:
				deleteStudentTable();
				break;
			case 4:
				insertStudentRecords(input);
				break;
			case 5:
				updateStudentRecords(input);
				break;
			case 6:
				deleteStudentRecords(input);
				break;
			case 7:
				displayStudentRecords();
				break;
			case 8:
				getStudentCount();
				break;
			default:
				System.exit(0);
			}

		}

	}

	public static void performTest() {

		// Printing Connection Parameters
		System.out.println("Connection Parameters Used");
		System.out.println("Driver: " + DRIVER);
		System.out.println("Url: " + URL);
		System.out.println("User Name: " + USERNAME);
		System.out.println("Password: " + PASSWORD);

		// Testing connection with the above parameters
		System.out.println("Testing Connections");
		if (!testConnections()) {
			// Exit if connection fails
			System.out.println("Unable to Establish Connection to the Database");
			System.exit(0);
		}

	}

	public static Connection getConnection() throws Exception {

		Connection con = null;

		// Loading the driver
		Class.forName(JDBCMain.DRIVER);

		// Establishing Connection
		con = DriverManager.getConnection(JDBCMain.URL, JDBCMain.USERNAME, JDBCMain.PASSWORD);

		return con;
	}

	public static void closeConnection(Connection con) throws SQLException {
		if (con != null)
			con.close();
	}

	public static boolean testConnections() {

		try {
			Connection con = getConnection();
			System.out.println("Connection Established!!!");
			closeConnection(con);
			System.out.println("Connection Closed!!!");
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public static void createStudentTable() {
		// Creating Student Table
		CreateStudents students = new CreateStudents();
		try {
			students.createStudentsTable();
			System.out.println("Student Table Created!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void deleteStudentTable() {
		// Deleting Student Table
		DeleteStudents students = new DeleteStudents();
		try {
			students.deleteStudentsTable();
			System.out.println("Student Table Deleted!!!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertStudentRecords(Scanner in) {
		// Inserting records into Student Table
		while (true) {
			System.out.println("Do you want to insert a student record?y/n");
			if (in.next().equals("n"))
				break;
			InsertStudents student = new InsertStudents();
			System.out.println("Please Enter Studet ID(Integer) Name (VarChar[30]) Marks (Decimal)");
			student.setId(in.nextInt());
			student.setName(in.next());
			student.setMarks(in.nextDouble());
			try {
				student.insertStudentRecord();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Student recorded inseted!!!");
		}	}

	public static void updateStudentRecords(Scanner in) {
		// Updating Student records
		while (true) {
			System.out.println("Do you want to update a student record?y/n");
			if (in.next().equals("n"))
				break;
			UpdateStudentRecord student = new UpdateStudentRecord();
			System.out.println("Please Enter Studet ID(Integer) Name (VarChar[30]) Marks (Decimal)");
			student.setId(in.nextInt());
			student.setName(in.next());
			student.setMarks(in.nextDouble());
			try {
				student.updateStudentRecord();
				System.out.println("Student recorded updated!!!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void deleteStudentRecords(Scanner in) {
		// Deleting Student records
		while (true) {
			System.out.println("Do you want to delete a student record?y/n");
			if (in.next().equals("n"))
				break;
			DeleteStudentRecord student = new DeleteStudentRecord();
			System.out.println("Please Enter Studet ID(Integer)");
			student.setId(in.nextInt());
			try {
				student.deleteStudentRecord();
				System.out.println("Student record deleted!!!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void displayStudentRecords() {
		// Retrieving records from database
		System.out.println("Student records in the database are:");
		SelectStudentRecords records = new SelectStudentRecords();
		try {
			List<Student> studentList = records.selectStudentRecords();
			studentList.forEach(System.out::println);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void getStudentCount() {
		try {
			System.out.println(GetStudentCount.getRecordCount());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
