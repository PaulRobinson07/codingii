import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);
		
		//user input string
		String user_string;	

		int user_string_len;

		//gets the user's string to check 
		System.out.print("Give string to check: ");
		user_string = keyboard.nextLine();
	
		//gets the new string based on several conditions
		user_string = check_string(user_string);

		//returns the new string
		System.out.print(user_string);
	}
	//method for getting the new string
	public static String check_string(String str) {
		//if the string is less than five characters the string is made lowercase
		if (str.length()<5) {
			return str.toLowerCase();
		}
		//if the string is more than ten characters the string is made uppercase
		if (str.length()>10) {
			return str.toUpperCase();
		}
		//if the string meets none of the other parameters it is returned as silience
		else {
			return "silence";
		}
	}
}
