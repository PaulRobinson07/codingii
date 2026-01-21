import java.util.Scanner;

public class leap_year2 {
	//variables used to determine if the year is a leap year
	static int user_year;
	static boolean leap_year;
	
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);
	
		//gets the user's string to check 
		System.out.print("Give year to check: ");
		user_year = keyboard.nextInt();

		//checks if the given year is a leap year
		leap_year = check_year();
		
		//if its a leap year say the year n is a leap year and end the program
		if (leap_year) {
			System.out.println("The year " + user_year + " is a leap year");
			return;
		}
		//if its not a leap year say the year n is not a leap year
		System.out.println("The year " + user_year + " is not a leap year");
	}
	//checks if the given year is a leap year
	public static boolean check_year() {
		//if divisible by 400 it is a leap year
		if (user_year % 400 == 0) {
			return true;
		}
		//if divisible by 100 but not 400 it is a not leap year
		if (user_year % 100 == 0) {
			return false;
		}
		//if divisible by 4 it is a leap year
		if (user_year % 4 == 0) {
			return true;
		}
		//its not a leap year
		return false;
	}
}

