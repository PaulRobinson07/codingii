import java.util.Scanner;

//gets a list from the user of ints
//adds them all up
public class sum_list {
	//variables for later use
	static int array_len;
	static int sum = 0;

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

		//loops over every other number
		for (int i=0; i<array_len; i++) {
			sum+=array[i];
		}

		//returns the smallest number to user
		System.out.println("The sum is: " + sum);
		System.out.println("Existing program");
	}
}
