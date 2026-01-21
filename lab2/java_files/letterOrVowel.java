import java.util.Scanner;

public class letterOrVowel {
	//array that holds all chars used to check for
	char[] chars_to_check = {'a','e','i','o','u','y','0','1','2','3','4','5','6','7','8','9'};

	//string that holds the user input and which is manipulated later
	String user_string;

	//runs on start
	public void main(String[] args) {

		//used to get user input
		Scanner keyboard = new Scanner(System.in);
	
		//return bool
		boolean string_meets_condition;

		//gets the user's string to check 
		System.out.print("Give string to check: ");
		user_string = keyboard.nextLine();

		//makes the string not case sensitive
		user_string = user_string.toLowerCase();
	
		//checks the first string's character to see if it has one of the chars
		string_meets_condition = check_char(0);

		//lets the user know if their string has one of the specified characters
		if (string_meets_condition) {
			System.out.println("String has one of the chars at the start");
			System.out.print(string_meets_condition);
		}
		else {
			System.out.println("String does not have one of the chars at the start");
			System.out.print(string_meets_condition);
		}

	}
	//method for checking if the string has one of the specified chars at a given index
	public boolean check_char(int index) {
		//loops over all chars
		for (int i=0; i<chars_to_check.length; i++) {
			//checks for similarity
			if (user_string.charAt(index) == chars_to_check[i]) {
				//the string do have one of the specified chars at that index
				return true;
			}
		}
		//the string doesn't have any of the specified chars listed at that index
		return false;
	}
}
