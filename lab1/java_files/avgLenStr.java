import java.util.Scanner;

public class avgLenStr {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String str1, str2;
		double avgLen;

		//gets user input
		System.out.print("String one: ");
		str1 = keyboard.nextLine();

		//gets user input
		System.out.print("String Two: ");
		str2 = keyboard.nextLine();
		
		//calculates the average length of the two strings
		avgLen = (str1.length()+str2.length())/2;	
		//gives the persons grade back to them
		System.out.println("The average length of the two strings is: " + avgLen);
	}
}
