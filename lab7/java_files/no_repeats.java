import java.util.Scanner;

public class no_repeats {
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

		//checks for repeats in the given array
		if (check_repeats(array)) {
			System.out.println("There are no repeats");
			System.out.println("Exiting program");
			return;
		}
		
		System.out.println("There are repeats");
		System.out.println("Exiting program");
	}

	//method for checking if there are repeats in an array
	public static boolean check_repeats(int[] arr) {
		//loops over every number
		for (int i=0; i<arr.length; i++) {
			//loops over all unchecked combinations
			for (int j=i+1;j<arr.length;j++) {
				//if the current first and other checked are the same there is a repeat
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}

		//the loops got through so there are no repeats
		return true;

	}
}
