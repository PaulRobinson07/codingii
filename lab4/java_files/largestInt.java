import java.util.Scanner;

//takes in N ints specified by the user and determines which of them is the biggest
public class largestInt {
	static int number_count;
	static int[] numbers;
	static int largestN;
	public static void main(String[] args) {
		//setup for user input
		Scanner keyboard = new Scanner(System.in);

		//gets the N number of numbers 
		System.out.println("Give a int for the number of numbers you want to compare");
		number_count = keyboard.nextInt();

		//sets the array to the length of the number previously given by the user
		numbers = new int[number_count];

		//gets all the numbers from the user
		for (int i=0; i<number_count;i++) {
			//gets the N number from user
			System.out.print("What is number " + (i+1) + ": ");
			numbers[i] = keyboard.nextInt();

			//makes a new line to get the next number
			System.out.println();
		}
		//gets the largest number and sets the largestN variable to the value returned
		largestN = getLargestN();

		//returns the largest number to the user
		System.out.println("The largest number is " + largestN);
	}

	//gets the largest number from the array numbers
	public static int getLargestN() {
		//sets the comparision variable to the first value
		int num_largest = numbers[0];
		//loops over every other array number
		for (int i=1; i<number_count; i++) {
			//if its bigger the comparision variable is set to the current array number 
			if (num_largest<numbers[i]) {
				num_largest = numbers[i];
			}
		}
		//gives back the largest number
		return num_largest;
	}

}
