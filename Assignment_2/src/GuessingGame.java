
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		Random random = new Random();
		int randomInt = random.nextInt(100) + 1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Pick a number between 1 and 100");

		int counter = 1;

		while (true) {
			int input = scanner.nextInt();

			if (counter < 5) {
				if (!(input <= 100 && input >= 1)) {
					System.out.println("Your guess is not between 1 and 100, please try again");
				} else if (input < randomInt) {
					System.out.println("Please pick a higher number");
				} else if (input > randomInt) {
					System.out.println("Please pick a lower number");
				} else if (input == randomInt) {
					System.out.println("You win!");
					break;
				}
			} else {
				System.out.println("You lose!");
				System.out.println("The number to guess was: " + randomInt);
			}
			counter++;
		}

		scanner.close();

	}

}
