import java.util.Scanner;

//the user enters all their dog data
//the program returns the youngest and the oldest dogs
public class dogs {
	//variables for later use
	static int dog_count;
	static int youngest = 0;
	static int oldest = 0;

	//runs on start
	public static void main(String[] args) {
		//setup to get user input
		Scanner keyboard = new Scanner(System.in);

		//prompts the user for the size of the array
		System.out.println("Give the number of dogs");

		//sets the length variable to the length given by the user
		dog_count = keyboard.nextInt();
		keyboard.nextLine();

		//detects if the array is a valid size
		if (dog_count<=0) {
			//tells the user that they need to make a longer array 
			System.out.println("No data given so the oldest and youngest dog cannot be determined");
			System.out.println("Exiting program");
			return;
		}

		//makes the array the specified size
		dog[] array = new dog[dog_count];

		//loops to fill the array
		for (int i=0; i<dog_count; i++) {
			//gets the dog's name
			System.out.println("What is the next dog's name?");
			String name = keyboard.nextLine();

			//asks for the next dog's age
			System.out.println("What is it's age?");

			//gets the next dog's age
			int age = keyboard.nextInt();
			keyboard.nextLine();

			//makes a new dog class
			array[i] = new dog(age, name);
		}

		//if there is only one dog the program skips the age check
		if (dog_count==1) {
			//returns data to user
			System.out.println("The youngest and oldest is: " + array[youngest].name +" at: " + array[youngest].age + " years old");
			System.out.println("Exiting program");
			return;
		}
		//loops over every other number to check if the current one is older or younger than the known oldest or youngest
		for (int i=1; i<dog_count; i++) {
			if (array[youngest].age>array[i].age) {
				youngest = i;
			}
			if (array[oldest].age<array[i].age) {
				oldest = i;
			}
		}

		//returns data to user
		System.out.println("The youngest is: " + array[youngest].name +" at: " + array[youngest].age + " years old");
		System.out.println("The oldest is: "  + array[oldest].name +" at: " + array[oldest].age + " years old");
	}
}
