import java.util.Scanner;

//maintains the cookie jars and gets user inputs
public class cookieJar {
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);
		
		//prompts the user for the size of the cookie jar
		System.out.println("Give the max capacity of your cookie jar");

		//makes a cookie jar with the user's input
		cookieJarClass cookieJar1 = new cookieJarClass(keyboard.nextInt());

		//finishes the line get for the scanner 
		keyboard.nextLine();

		//tells the user the amount of room they have left
		System.out.println("The cookie jar has " + cookieJar1.spaceLeft() + " space left for cookies");
		
		//prompts user if they'd like to add any cookies
		System.out.println("Would you like to add cookies to your cookie jar? (yes/no)");
		char output = keyboard.nextLine().charAt(0);	

		//if they want to add cookies ask and add N cookies to the cookie jar
		if (output=='y') {
			//prompts the user
			System.out.println("How many cookies would you like to add? ");
			System.out.print("Cookies to add: ");

			//adds all the cookies
			cookieJar1.addCookies(keyboard.nextInt());
		}

		//finishes the program
		System.out.println("Have a nice day");
		System.exit(0);
	}
}
