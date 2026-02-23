import java.util.Scanner;
import java.util.ArrayList;

//program that determines the mode of a sorted array
public class mode {
	//varaibles for getting mode
	static int mode;
	static int mode_count;
	static int mode_check;
	static int mode_check_count;
	//used to give back the first three numbers N greater than 11
	public static void main(String[] args){
		//setup for user input
		Scanner keyboard = new Scanner(System.in);

		//prompts the user for the size of the array
		System.out.println("Give the max capacity of your array");

		//sets the length variable to the length given by the user
		int array_len = keyboard.nextInt();

		//detects if the array is a valid size
		if (array_len<=0) {
			//tells the user that they need to make a longer array 
			System.out.println("Capacity must be greater than or equal to 1");
			System.out.println("Exiting program");
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

		//setup for mode variables
		mode = array[0];
		mode_count = 1;
		mode_check = array[0];
		mode_check_count = 1;

		//loops through the array
		for (int i=1; i<array_len; i++) {
			//if the current number is the same to the number being checked
			if (array[i] == mode_check) {
				//add one to the counter
				mode_check_count++;

				//if the current mode counter is greater than the biggest known mode the mode is changed to the currently checked number
				if (mode_check_count>mode_count) {
					mode = mode_check;
					mode_check = mode_check_count;
				}
			}

			//the mode current variables are reset
			else {
				mode_check = array[i];
				mode_check_count = 1;
			}
		}

		//returns the most frequent number to the user
		System.out.println("The most often frequent number in the array is : " + mode);
		System.out.println("Exiting program");
	}
}
