package io.github.ritikdevlab.learning.ch6.innerclasses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Nested {
	public static void main(String[] args) {
		OuterLayer.information info = new OuterLayer.information("Paramita", 22);
		
		IO.println("Name: " + info.name());
		IO.println("Age: " + info.age());
		
		IO.println("Estimated birth date: " + OuterLayer.Age.bornTime(info.age()));
		IO.println("Age group: " + OuterLayer.AgeGroup.fromAge(info.age()));
	}
}

class OuterLayer {
	// The nested record, nested interface, nested enum is implicitly "static".
	record information(String name, int age) {};
	
	interface Age {
		static String bornTime(int age) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date = LocalDate.now().minusYears(age);
			return date.format(formatter);
		}
	}
	
	enum AgeGroup {
		CHILD, // 0-12
		TEENAGER, // 13-19
		ADULT, // 20-59
		SENIOR; // 60+
		
		static AgeGroup fromAge(int age) {
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative");
			}
			
			if (age <= 12) {
				return CHILD;
			}
			if (age <= 19) {
				return TEENAGER;
			}
			if (age <= 59) {
				return ADULT;
			}
			return SENIOR;
		}
	}
}