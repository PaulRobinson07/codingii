import java.util.Scanner;

//takes in number N from user as well as two strings of S1 and S2
//the program makes N rows with as many strings S1 as the row number
//the program takes S2 fill in the empty spots to make a box on the other half
public class loop_box {
	//N given by the user through the CLI
	static int user_int;

	//S1 and S2 given by the user through the CLI
	static String user_string1;
	static String user_string2;

	//empty string to prevent empty strings
	static String dummy_string;	
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number: ");
		user_int= keyboard.nextInt();
	
		//makes a new line so the string isn't bothered
		dummy_string= keyboard.nextLine();

		//gets the user's string
		System.out.print("Give a String: ");
		user_string1 = keyboard.nextLine();

		//gets the user's string
		System.out.print("Give a String: ");
		user_string2 = keyboard.nextLine();


		//loops for N and prints the lines of S 
		for (int i=0;i<=user_int;i++) {
			//writes the S1 as many times as the current line
			for (int j=0;j<i;j++) {
				System.out.print(user_string1 + " ");
			}
			//writes the S2 as many times as the current line subtracted from the total lines
			for (int j=0;j<user_int-i;j++) {
				System.out.print(user_string2 + " ");
			}
			//writes a new line
			System.out.println();
		}

		System.out.println("Program completed successfully");
	}
}
