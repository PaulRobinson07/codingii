import java.util.Scanner;

//takes in number N 
//gets the average value of all the digits
public class avg_of_digits {
	//N given by the user through the CLI
	static int user_int;

	//variable that holds user_int's deimcal places
	static int user_int_length;

	//variables used for calculating the average digit's number
	static int user_int_digit_sum;
	static float user_float_digit_avg;
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number to get the average digit length of: ");
		user_int= keyboard.nextInt();

		//gets the number of decimal places in the binary number
		user_int_length = String.valueOf(user_int).length();

		//loops through each of the demical places and converts each to base 10
		for (int i=0;i<user_int_length;i++) {
			user_int_digit_sum+=user_int%10;
			//removes the last decimal
			user_int/=10;
		}

		user_float_digit_avg = (float) user_int_digit_sum / user_int_length;

		//gives the new number to user
		System.out.println("The average value of each digit is " + user_float_digit_avg);
		System.out.println("Program completed successfully");
	}
}
