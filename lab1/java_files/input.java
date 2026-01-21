import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int int1, int2;
		String name;
		float grade;

		//gets user input
		System.out.println("What's your name?");
		name = keyboard.nextLine();

		//gets user input
		System.out.print("Enter integer one: ");
		int1 = keyboard.nextInt();

		//gets user input
		System.out.print("Enter integer two: ");
		int2 = keyboard.nextInt();

		//gets user input
		System.out.println("What's your grade in Mr.Barkers class (%)?");
		grade = keyboard.nextFloat();

		//gives the persons name back to them
		System.out.println("Your name is: " + name);
		
		//lists out the ints given
		System.out.println("Integer one: " + int1);
		System.out.println("Integer two: " + int2);

		//gives the persons grade back to them
		System.out.println("Your grade is: " + grade );
	}
}
