package io.github.ritikdevlab.learning.Ch5.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MeConInvoke {
	private String Name;
	private int Age;
	private String Aim;
	
	/**
	 * Creates an empty student object.
	 */
	public MeConInvoke() {
		super();
	}

	/**
	 * The constructor for the information of student.
	 * 
	 * @param name the name of student
	 * @param age  the age of student
	 * @param aim  the aim of student
	 */
	public MeConInvoke(String name, int age, String aim) {
		Name = name;
		Age = age;
		Aim = aim;
	}

	/**
	 * {@return the aim of student}
	 */
	public String getAim() {
		return Aim;
	}

	/**
	 * Sets the student's aim.
	 * 
	 * @param aim the aim to set for student
	 */
	public void setAim(String aim) {
		Aim = aim;
	}

	/**
	 * {@return the name of student}
	 */
	public String getName() {
		return Name;
	}

	/**
	 * {@return the age of student}
	 */
	public int getAge() {
		return Age;
	}

	void main() throws Exception {
		Constructor<?> constructor = this.getClass().getConstructor(String.class, int.class, String.class);
		Object obj = constructor.newInstance("Ritik sabat", 19, "Developer");

		MeConInvoke student = (MeConInvoke) obj;

		Method[] methods = student.getClass().getDeclaredMethods();

		for (Method m : methods) {
			if (m.getName().startsWith("get") && m.getParameterCount() == 0 && m.getReturnType() != void.class) {
				Object value = m.invoke(student);
				
				IO.println(m.getName() + " = " + value);
			}
		}
		
		Method method = this.getClass().getDeclaredMethod("setAim", String.class);
		method.invoke(student, "Full stack developer");
		
		Object updatedAim = student.getAim();

	    IO.println("Changed to(getAim) -> " + updatedAim);
	}
}
