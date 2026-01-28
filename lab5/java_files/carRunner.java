import java.util.Scanner;

//handles cars based on data given by the user
public class carRunner {
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//vars used for getting the user's car data
		int miles_current;
		int miles_max;
		int miles_since_change;

		//prompts the user for the reccomend distance between oil changes
		System.out.println("How many miles does your car have?");
		miles_current = keyboard.nextInt();

		//prompts the user for the user's current mileage
		System.out.println("Give the recommended distance travelled between oil changes.");
		miles_max = keyboard.nextInt();

		//prompts the user for the user's mileage since last oil change
		System.out.println("Give the distance since the car's last oil change");
		miles_since_change = keyboard.nextInt();

		//makes a car with the user's input
		car car1 = new car(miles_current, miles_max, miles_since_change);

		//finishes the line get for the scanner 
		keyboard.nextLine();

		//tells the user the amount of room they have left
		car1.oilChangeNeeded();
		
		//prompts user if they'd like to add any miles to the count
		System.out.println("Would you like to add miles? (yes/no)");
		char output = keyboard.nextLine().charAt(0);	

		//if they want to add miles ask and add N miles to the mileage counter 
		if (output=='y') {
			//prompts the user
			System.out.println("How many miles would you like to add? ");
			System.out.print("miles to add: ");

			//adds all the cookies
			car1.addMiles(keyboard.nextInt());
		}

		//finishes the program
		System.out.println("Have a nice day");
		System.exit(0);
	}
}
