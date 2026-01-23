import java.util.Scanner;

//takes in number N from user as base 2
//returns the number in base 10
public class base2_to_base10 {
	//N given by the user through the CLI
	static int user_int;

	//variable that holds N turned into binary
	static int base10;

	//variable that holds user_int's deimcal places
	static int user_int_length;
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number in unsigned binary to convert: ");
		user_int= keyboard.nextInt();

		//gets the number of decimal places in the binary number
		user_int_length = String.valueOf(user_int).length();

		//loops through each of the demical places and converts each to base 10
		for (int i=0;i<user_int_length;i++) {
			//gets the next decimal's value
			switch (user_int%10) {
				case 0:
					//nothing happens
				break;
				case 1:
					//2 to the power of i is added
					base10+=Math.pow(2,i);
				break;
				default:
					//the user gets the warning that their number was not binary
					//the program stops
					System.out.println("The number entered was not in base 2");
					return;
			}
			//removes the last decimal
			user_int/=10;
		}

		//gives the new number to user
		System.out.println("The unsigned binary value is " + base10 + " in base 10");
		System.out.println("Program completed successfully");
	}
}
