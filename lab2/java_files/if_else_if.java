import java.util.Scanner;

public class if_else_if {
	//numbers we want to check with
	static final int UPPER_BOUND = 10000;
	static final int LOWER_BOUND = 9000;

	//number variable for getting user's number
	static int user_val;

	//variable for storing what the user should do
	static String user_mod;

	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.println("Give number to check");
		user_val = keyboard.nextInt();
		
		//gets the the string saying what the user should do based on their input
		user_mod = check_user_number();

		//gives the user their next move 
		System.out.print("You should: ");
		System.out.print(user_mod);
	}
	//returns string telling user what to do based on their input
	public static String check_user_number() {
		//checks if their number is above a certain point
		if (user_val >UPPER_BOUND) {
			return "fall";
		}
		//checks if their number is below a certain point
		if (user_val < LOWER_BOUND) {
			return "jump";
		}
		//between the two so return other input
		return "fly";
	}
}
