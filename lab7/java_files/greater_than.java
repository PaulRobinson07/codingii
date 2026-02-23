import java.util.Scanner;
import java.util.ArrayList;

//program that returns the first three numbers in an array greater than 11
public class greater_than {
	//used to give back the first three numbers N greater than 11
	static ArrayList<Integer> return_array = new ArrayList<>();
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
		
		//loops through the array
		for (int i=0; i<array_len; i++) {
			//adds to the arraylist if the current number is greater than 11
			if (array[i]>11 && return_array.size()<3) {
				return_array.add(array[i]);
			}

			//returns the arraylist if the size is equal to three
			if (return_array.size()==3) {
				System.out.println(return_array);
				System.out.println("Exiting program");
				return;
			}
		}
		
		//returns the incomplete array
		System.out.println(return_array);
		System.out.println("Exiting program");
	}
}
