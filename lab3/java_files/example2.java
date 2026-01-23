import java.util.Scanner;

//takes in number N from user 
//computes N's factorial with a for loop
//only works for return numbers that are less than 1.78e308
public class example2 {
	//N given by the user through the CLI
	static long user_long;
	//variable to store the number N factorial
	static long return_number = 1;
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number to compute the factorial of: ");
		user_long= keyboard.nextLong();
	
		//calculates the factorial number
		for (long i=1;i<=user_long;i++) {
			return_number*=i;
		}

		//tells the user the number is too large to compute
		if (return_number==0) {
			System.out.println("Number is too large to compute");
			return;
		}

		//returns the computed number
		System.out.println(user_long + " factorial is " + return_number);
	}
}
