package com.date_time_api;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeApiDemo {
  
	public static void main(String[] args) {
		LocalDate today =  LocalDate.now();   //This function(LocalDate.now) assigns date of our system for output.
		System.out.println(today);
		
		
		LocalDate epoch = LocalDate.EPOCH;   //Epoch(LocalDate.EPOCH) starts from 1st January 1970
		System.out.println(epoch);
		
		LocalDate epochHistory = LocalDate.EPOCH.plus(19896, ChronoUnit.DAYS);   //Add number of days in epoch(1st january 1970)  [LocalDate.EPOCH.plus(__ , ChronoUnit.DAYS)] to get the desired date.
		System.out.println(epochHistory);
		
		LocalDate tomorrow = LocalDate.of(2024,02,23);
		System.out.println(tomorrow);
		
		LocalDate formattedDate = LocalDate.parse("22.06.2024",    //To get the date in our desire format(whether DD.MM.YYYY or MM.DD.YYYY, or whatever we wish)
	       DateTimeFormatter.ofPattern("dd.MM.yyyy"));    //We can also use 'dd/MM/yyyy' instead
		System.out.println(formattedDate);
	
	   LocalDate zonedDate = LocalDate.now(ZoneId.of("America/Los_Angeles"));   //To get time of different time zone across the world. We can 'ctrl + click' on 'ZoneId.' to see all options of zone
	   System.out.println(zonedDate);
	
	    LocalDate bDay = LocalDate.parse("2002-10-29");
	    System.out.println(bDay.getDayOfWeek());    //To know the weekday of desired date.
	    System.out.println(bDay.getMonth());        //To know the month of desired date.
	    String strbDay = bDay.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));   //Changing the format of our date
	    System.out.println(strbDay);
	    bDay= bDay.plusWeeks(2);   //To know date after exactly 2 weeks of bDay.
	    System.out.println(bDay);
	
	}
}

        