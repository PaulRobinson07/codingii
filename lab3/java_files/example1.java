import java.util.Scanner;

//takes in number N from user 
//tells them if N is greater, equal to, or less than 10
//if less than the program increments and prints each number leading up to 10 
public class example1 {
	//N given by the user through the CLI
	static int user_int;
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number: ");
		user_int= keyboard.nextInt();
		
		//tells the user the number is greater than 10
		if (user_int > 10) {
			System.out.println("Given number, " + user_int + " is greater than ten");
			System.out.println("Program completed successfully");
			return;
		}

		//tells the user the number is 10
		if (user_int == 10) {
			System.out.println("Given number, " + user_int + " is equal to ten");
			System.out.println("Program completed successfully");
			return;
		}
		
		//tells the user that the number is less than 10
		System.out.println("Given number, " + user_int + " is less than ten");

		//prints the number at each number N and then increments it until it reaches 10
		System.out.println(user_int);
		while (user_int < 10) {
			user_int++;
			System.out.println(user_int);
		}
		System.out.println("Program completed successfully");
	}
}
