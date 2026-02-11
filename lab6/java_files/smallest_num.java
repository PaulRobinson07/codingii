import java.util.Scanner;

//gets the smallest number from a list
//tells the user if the list is an invalid size ex: -1
public class smallest_num {
	//variables for later use
	static int array_len;
	static int smallest_num;

	//runs on start
	public static void main(String[] args) {
		//setup to get user input
		Scanner keyboard = new Scanner(System.in);

		//prompts the user for the size of the array
		System.out.println("Give the max capacity of your array");

		//sets the length variable to the length given by the user
		array_len = keyboard.nextInt();

		//detects if the array is a valid size
		if (array_len<=0) {
			//tells the user that they need to make a longer array 
			System.out.println("Capacity must be greater than or equal to 1");
			System.out.println("Existing program");
			return;
		}

		//makes the array the specified size
		int[] array = new int[array_len];

		//loops to fill the array
		for (int i=0; i<array_len; i++) {
			//prompts user for the next number
			System.out.println("What is the next number in the array?");

			//adds new number to the list
			array[i] = keyboard.nextInt();
		}

		//detects if there's only one variable in the array
		if (array_len == 1) {
			//gives the user the first and only array value
			System.out.println("The smallest number is: " + array[0]);
			System.out.println("Existing program");
		}

		//sets the comparision variable to find the smallest value
		smallest_num = array[0];

		//loops over every other number
		for (int i=1; i<array_len; i++) {
			//determines if the current checked number is smaller than the current smallest
			if (smallest_num>array[i]) {
				//smallest is set to the current one
				smallest_num = array[i];
			}
		}

		//returns the smallest number to user
		System.out.println("The smallest number is: " + smallest_num);
		System.out.println("Existing program");
	}
}
