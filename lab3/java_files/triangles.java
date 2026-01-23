import java.util.Scanner;

//takes in number N from user as well as string S 
//the program makes N rows with as many strings S as the row number
public class triangles {
	//N given by the user through the CLI
	static int user_int;

	//S given by the user through the CLI
	static String user_string;
	//runs on start
	public static void main(String[] args) {
		//used to get user input
		Scanner keyboard = new Scanner(System.in);

		//gets the user's number
		System.out.print("Give a number: ");
		user_int= keyboard.nextInt();
		
		user_string = keyboard.nextLine();

		//gets the user's string
		System.out.print("Give a String: ");
		user_string = keyboard.nextLine();

		//loops for N and prints the lines of S 
		for (int i=0;i<=user_int;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(user_string + " ");
			}
			System.out.println();
		}

		System.out.println("Program completed successfully");
	}
}
