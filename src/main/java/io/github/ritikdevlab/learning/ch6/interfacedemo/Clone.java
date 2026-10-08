package io.github.ritikdevlab.learning.ch6.interfacedemo;

import module java.base;

public class Clone {
	public static void main(String[] args) throws Exception {
		People originalPeople = new People("Nabin Sena", 54);
		
		People clonePeople = originalPeople.clone();
		clonePeople.setAge(20);
		
		
		Student originlStudent = new Student("Sagar Panda", 10, "5th", 250);
		
		Student cloneStudent = originlStudent.clone();
		cloneStudent.setAge(50);
		cloneStudent.setAdmitionDate(2006, 9, 16);
		
		
		IO.println("original:- " + originalPeople);
		IO.println("clone:-" + clonePeople);
		
		IO.println("-".repeat(25));
		
		IO.println("original:-" + originlStudent);
		IO.println("clone:- " + cloneStudent);
	}
}

final class People implements Cloneable {
	private String name;
	private int age;
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 *  Shallow clone -> A shallow clone creates a new outer object, 
	 *  				but the objects referenced inside it are not copied.
	 *  	 			Both objects point to the same nested objects.
	 */
	
	public People clone() throws CloneNotSupportedException {
		People cloned = (People) super.clone();
		return cloned;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "People[name=" + name + " ,age=" + age;
	}
}

final class Student implements Cloneable {
	private String Name;
	private int Age;
	private String Class;
	private Date admitionDate;
	
	public Student(String name, int age, String Class, int Mark) {
		this.Name = name;
		this.Age = age;
		this.Class = Class;
		admitionDate = new Date();
	}
	
	// Deep clone -> A deep clone creates a new outer object and also copies the nested objects.
	public Student clone() throws CloneNotSupportedException {
		Student cloned = (Student) super.clone();
		
		cloned.admitionDate = (Date) admitionDate.clone();
		return cloned;
	}

	public void setAdmitionDate(int year, int month, int day) {
		long time = LocalDate.of(year, month, day).atStartOfDay(ZoneId.systemDefault()).toEpochSecond() * 1000;
		
		admitionDate.setTime(time);
	}
	
	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Age=" + Age + ", Class=" + Class + ", admitionDate=" + admitionDate + "]";
	}
	
}