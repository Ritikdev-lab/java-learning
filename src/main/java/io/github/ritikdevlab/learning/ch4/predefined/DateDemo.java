package io.github.ritikdevlab.learning.ch4.predefined;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate newYearsEve = LocalDate.of(2026,4,28);

		//This method are the accessor method because it only accesee the object without modifying them
		//This method meethod is used for the getting the given year
		int year = newYearsEve.getYear();

		//This method is used for getting the given month
		int month = newYearsEve.getMonthValue();

		//This method is used for getting the given month
		int day = newYearsEve.getDayOfMonth();
		IO.println("The Year is " + year);
		IO.println("The month is " + month);
		IO.println("The day is " + day);
		
		//This method add the days with previous date and give the result
		LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
		int Year = aThousandDaysLater.getYear();
		int Month = aThousandDaysLater.getMonthValue();
		int Day = aThousandDaysLater.getDayOfMonth();
		IO.println("The year is " + Year + " And the month is " + Month + " And the day is " + Day);
		/*The LocalDate class has encapsulated instance fields to maintain the date to which it is set. Without
		looking at the source code, it is impossible to know the representation that the class uses internally.
		But, of course, the point of encapsulation is that this doesn’t matter. What matters are the methods that
		a class exposes.*/

		IO.println("-".repeat(60));

		//Here this method is called the mutator method because it access object and modify them
		GregorianCalendar someDay = new GregorianCalendar(1999,11,31);
		someDay.add(Calendar.DAY_OF_MONTH,1000);
		int Year1 = someDay.get(Calendar.YEAR);
		int Month1 = someDay.get(Calendar.MONTH) + 1;
		int Day1 = someDay.get(Calendar.DAY_OF_MONTH);
		IO.println("The year changes from 1999 to " + Year1);
		IO.println("The change the month from 11 to " + Month1);
		IO.println("The Day change from 31 to "+Day1);

		IO.println("-".repeat(60));

		//1.This create a constructs an object that represents the current date
		LocalDate Time = LocalDate.now();

		//2.This constructs an object that represents the given date
		LocalDate Date = LocalDate.of(2026, 5, 21);

		//3.This get an year of the specific variable
		int Year2 = Time.getYear();
		int year2 = Date.getYear();

		//4.This get an month of a specific variable
		int Month2 = Time.getMonthValue();
		int month2 = Date.getMonthValue();

		//5.This get an day value of a specific variable
		int Day2 = Time.getDayOfMonth();
		int day2 = Date.getDayOfMonth();

		//6.This is used for for getting the days of the week
		DayOfWeek Time3 = Time.getDayOfWeek();
		DayOfWeek Date3 = Date.getDayOfWeek();

		//7.This add the specific numbers of the days in the days
		LocalDate Time4 = Time.plusDays(12);
		LocalDate Date4 = Date.plusDays(9);

		//8.This substarct the specific numbers of days in the days
		LocalDate Time5 = Time.minusDays(2);
		LocalDate Date5 = Date.minusDays(20);

		IO.println("In the time variable the year is " + Year2 + " and the month is " + Month2 + " and the day is " + Day2);
		IO.println("The week days is " + Time3);
		IO.println("After adding 12 days it become " + Time4 + " After subtractring 2 days it becomes " + Time5);

		IO.println("-".repeat(60));

		IO.println("In the Date variable the year is " + year2 + " and the the month is " + month2 + " and the day is " + day2);
		IO.println("The week days is " + Date3);
		IO.println("After adding 9 days it become " + Date4 + " and after subtractring 20 days it becomes " + Date5);
	}	
}