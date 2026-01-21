import java.util.Scanner;

public class switchFirstLetter{
	public static void main(String[] args) {
		//setup for getting user input
		Scanner keyboard = new Scanner(System.in);

		String str1, str2;
		StringBuilder str3 = new StringBuilder("");
		StringBuilder str4 = new StringBuilder("");
		//gets user input
		System.out.print("String one: ");
		str1 = keyboard.nextLine();

		//gets user input
		System.out.print("String Two: ");
		str2 = keyboard.nextLine();
		
		str3.append(str2.charAt(0));
		str4.append(str1);
		str4.deleteCharAt(0);
		//gives the persons grade back to them
		System.out.println("Your new string is: " + str3 + str4);
	}
}
