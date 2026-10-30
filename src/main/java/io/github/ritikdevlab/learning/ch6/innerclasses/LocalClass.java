package io.github.ritikdevlab.learning.ch6.innerclasses;

/**
 * Local Class: It is class declared inside a method, constructor, 
 * 				or a block of code instead of directly inside another class.
 * 
 * CHARACTERISTIC:
 * 1. It's scope is Restricted to the block in which they are declared.
 */
public class LocalClass {
	public static void main(String[] args) {
		ClgStudent intern = new ClgStudent("Govind biswal", 20, 80);
		
		IO.println("Information of Student:");
		IO.println("Name: " + intern.getName());
		IO.println("Age: " + intern.getAge());
		IO.println("Mark Secured in Exam of 100: " + intern.getMarkSecured());
		
		intern.markPercentage();
	}
}
class ClgStudent {
	private String name;
	private int age;
	private double markSecured;
	
	public ClgStudent(String name, int age, int markSecured) {
		this.name = name;
		this.age = age;
		this.markSecured = markSecured;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getMarkSecured() {
		return markSecured;
	}
	
	public void markPercentage() {
		final class Percent {
			public void calculate() {
				double percentage = (markSecured / 100) * 100;
				IO.println("Mark Percentage: " + percentage + "%");
			}
		}
		Percent p = new Percent();
		p.calculate();
	}
	
}