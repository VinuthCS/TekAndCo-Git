package com.TekAndCo.Java8.datetimedemo;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 * @author vinuth
 * 
 * prior to 1.8 update, java supported Date classes from two packages
 * java.sql.date and java.util.data and these class have different formats 
 * and uses. Any formatting would require creating additional functions.
 * To simplify this, new package was added to support date and time 
 *
 */

public class DateTimeDemo {

	public static void main(String[] args) {
		
		java.util.Date utilDate = new java.util.Date();
		System.out.println("Date using java.util: "+utilDate);
		
		java.sql.Date sqlDate = new java.sql.Date(0);
		System.out.println("Date using java.sql: "+sqlDate);
		
		LocalDate localDateNow = LocalDate.now();
		LocalDate localDateof = LocalDate.of(2000, Month.JANUARY, 28);

	}

}
