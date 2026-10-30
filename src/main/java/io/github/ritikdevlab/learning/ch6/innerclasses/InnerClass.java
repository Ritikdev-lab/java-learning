package io.github.ritikdevlab.learning.ch6.innerclasses;

public class InnerClass {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog.Animal dogAnimal = dog.new Animal("Dog");
		
		IO.println(dogAnimal.getClass());
		
		Runnable c = () -> dogAnimal.print();
		c.run();
	}
}

class Dog {
	private String sound = "Bark";
	
	class Animal {
		private String species;
		
		public Animal(String species) {
			this.species = species;
		}
		
		public void print() {
			IO.println("Species:- " + species + "\nSound:- " + sound);
		}
	}
}