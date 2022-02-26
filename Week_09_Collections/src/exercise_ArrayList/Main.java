package exercise_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<String> toDoList = new ArrayList<String>();

	public static void main(String[] args) {

		boolean check = true;
		while (check) {

			System.out.println("Please pick your process..");
			System.out.println("1 to add");
			System.out.println("2 to remove");
			System.out.println("3 to update");
			System.out.println("4 to display");
			System.out.println("5 to quit");
			System.out.println("");

			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			scanner.nextLine();

			switch (a) {
			case 1:
				System.out.println("************************");
				System.out.println("Please Enter your list..");
				String s = scanner.nextLine();
				add(s);
				System.out.println("");
				break;
			case 2:

				System.out.println("Please Enter your list number to remove..");
				int l = scanner.nextInt();
				remove(l);
				break;
			case 3:
				System.out.println("Please enter index number");
				int i = scanner.nextInt();
				System.out.println("Please enter list string");
				scanner.nextLine();
				String k = scanner.nextLine();
				update(i, k);
				break;
			case 4:
				display(toDoList);
				System.out.println("");
				break;
			case 5:
				check = false;
				break;
			default:
				System.out.println("Invalid process..");
			}

		}

	}

	public static void add(String s) {
		toDoList.add(s);

	}

	public static void remove(int i) {
		toDoList.remove(0);
	}

	public static void update(int i, String s) {
		toDoList.set(i, s);
	}

	public static void display(List<String> a) {

		for (String s : a) {
			System.out.println(s);
		}

	}
}
