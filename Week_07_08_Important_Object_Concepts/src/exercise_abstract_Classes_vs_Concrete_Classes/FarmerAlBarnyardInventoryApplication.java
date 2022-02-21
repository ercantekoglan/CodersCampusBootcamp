package exercise_abstract_Classes_vs_Concrete_Classes;

public class FarmerAlBarnyardInventoryApplication {

	public static void main(String[] args) {
		
		System.out.println("ZzZzZzZz.....");
		
		// Farmer Al knows he heard a cow, create a cow object and get its animal sound, then put him to bed!
		Cow cow = new Cow();
		cow.animalSound();
		cow.sleep();
		System.out.println("------------------------");
		// Lets see if we can do this for the Pig and the Sheep as well...
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
		System.out.println("------------------------");
		Sheep sheep = new Sheep();
		sheep.animalSound();
		sheep.sleep();
	}

}
