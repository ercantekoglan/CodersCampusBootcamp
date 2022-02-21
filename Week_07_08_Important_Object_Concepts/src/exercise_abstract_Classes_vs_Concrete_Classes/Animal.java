package exercise_abstract_Classes_vs_Concrete_Classes;

public abstract class Animal {
		
	// We call an abstract method here to FORCE each class to make its own animal sound. 
	// i.e Pig goes oink, Cow goes Moo....
	public abstract void animalSound();
	
	// Animals however, all sleep
	public void sleep() {
		System.out.println("ZzZzZzZz.....");
	}

}
