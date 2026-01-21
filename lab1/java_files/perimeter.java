import java.util.Scanner;

public class perimeter {
	public static void main(String[] args) {
		//gets the scanner for user input	
		Scanner keyboard = new Scanner(System.in);

		//variables needed for the calculation
		float len1, len2;
		float perimeter;

		//gets user input
		System.out.println("Enter side length one: ");
		len1 = keyboard.nextFloat();

		//gets user input
		System.out.println("Enter side length two: ");
		len2 = keyboard.nextFloat();
	
		perimeter = len1*2 + len2*2;

		//lists out the ints given
		System.out.println("The perimeter is: " + perimeter);
	}
}
