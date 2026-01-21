import java.util.Scanner;

public class degFtoDegC{
	public static void main(String[] args) {
		//gets the scanner for user input	
		Scanner keyboard = new Scanner(System.in);

		//variables needed for the calculation
		double degF, degC;

		//gets user input
		System.out.println("Enter temperature (Fahrenheit): ");
		degF= keyboard.nextDouble();

		//converts the given temp to celsius
		degC = (degF-32)*(5.0/9.0);

		//gives back the calculation to user
		System.out.println("The temperature in celsius is: " + degC);
	}
}
