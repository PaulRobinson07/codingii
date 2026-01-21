import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		//number we want to check with
		int val_to_compare = 10;

		//number variable for getting user's number
		int user_val;

		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.println("Give number to check");
		user_val = keyboard.nextInt();

		//checks if the user's number is less than the number we want to check
		if (user_val<val_to_compare) {
			//doubles the user's number
			user_val *= 2;
			//gives the user their new number
			System.out.print("Your number was smaller than the checking number, so it was doubled to: ");
			System.out.print(user_val);
		}
		else {
			//gives the user their old number
			System.out.println("Your number was not smaller than the checking number, so it was not doubled");
			System.out.print("Your number is: ");
			System.out.print(user_val);
		}
	}
}
