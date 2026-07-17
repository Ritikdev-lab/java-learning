package io.github.ritikdevlab.Example;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarDemo {
	public static void main(String[] args) {
		/**
		 * This program prints a calendar for the current month
		 */
		LocalDate date = LocalDate.now();
		int month  = date.getMonthValue();
		int today = date.getDayOfMonth();
		//set to start of month by substracting (today date) with the (today date -1)
		date = date.minusDays(today-1);
		DayOfWeek weekday = date.getDayOfWeek();
		//Here 1=Monday,....,7=Sunday
		int value = weekday.getValue();
		IO.println("Mon Tue Wed Thu Fri Sat Sun");
		//This add blank spaces before the day starts
		for(int i = 1;i < value;i++){
			IO.print(" ");
		}
		while (date.getMonthValue() == month) {
			IO.print("%3d".formatted(date.getDayOfMonth()));
			if (date.getDayOfMonth() == today) {
				IO.print("*");
			}
			else{
				IO.print("");
			}
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1) {
				IO.println();
			}
		}
		if (date.getDayOfWeek().getValue() != 1) {
			IO.println();
		}

	}
}