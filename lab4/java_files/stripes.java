import java.util.Scanner;

//takes two chars, C1 and C2, and draws them N times in N lines
public class stripes {
	//width of the lines
	static final int WIDTH = 15;

	//number of lines
	static int stripe_lines_max;

	//char variables given by user to be drawn
	static char char1;
	static char char2;
	//runs on start
	public static void main(String[] args) {
		//setup for user input
		Scanner keyboard = new Scanner(System.in);

		//gets char1	
		System.out.println("Give a char");
		char1 = keyboard.nextLine().charAt(0);

		//gets char2	
		System.out.println("Give a char");
		char2 = keyboard.nextLine().charAt(0);

		//gets the N number of lines
		System.out.println("Give a int for the number of lines");
		stripe_lines_max= keyboard.nextInt();

		//loops over each of the lines
		for (int i=0; i<stripe_lines_max; i++) {
			//flip flops between drawing char1 and char2
			switch (i%2) {
				case 0:
					draw_line(char1);
				break;
				case 1:
					draw_line(char2);
				break;
			}
		}

	}
	//draw line method
	public static void draw_line(char c) {
		//draws the char C as many times as the WIDTH constant 
		for (int i=0; i<WIDTH; i++) {
			System.out.print(c);
		}
		//makes a new line for the next line
		System.out.println();
	}
}
