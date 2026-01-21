import java.util.Scanner;

public class socialSecurity {
	//array that holds all chars used to check for
	char valid_char = '-';

	//string that holds the user input and which is manipulated later
	String user_ssn;
	String ssn_validation;

	//runs on start
	public void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);
	
		//gets the user's string to check 
		System.out.print("Give SSN to check: ");
		user_ssn = keyboard.nextLine();

		//checks the ssn at index 3 and 6 for a dash
		ssn_validation = check_char(3,6);
		
		//prints if the ssn was valid or not
		System.out.print(ssn_validation);

	}
	//checks if the ssn is valid
	public String check_char(int index1, int index2) {
		//checks if the user's ssn has dashes after the 3rd and 6th number 
		if (user_ssn.charAt(index1) == valid_char && user_ssn.charAt(index2) == valid_char) {
			//returns the last for numbers of the user's ssn
			return user_ssn.substring(7,11);		
		}
		else {
			return "invalid SSN";
		}
	}
}
