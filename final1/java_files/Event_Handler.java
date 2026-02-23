import java.util.Scanner;

public class Event_Handler {
	Scanner keyboard = new Scanner(System.in);
	int current_action;
	boolean program_running = true;

	String[] actions = {"Show availible actions", "Add an item to your inventory", "Sell an item to the shopkeeper", "Show your inventory", "Show the shopkeeper's stock", "Exit the program"};
	int row_length = 50;

	public void loop() {
		get_next_action();
		switch (current_action) {
			case 0:
				give_help();
			break;
			case 1:
				//adds an item to the user's inventory
			break;
			case 2:
				//sells an item to the shopkeeper
			break;
			case 3:
				//displays the user's inventory
				main.handler.show_user_items();
			break;
			case 4:
				//displays the shopkeeper's inventory
				main.handler.show_shopkeeper_items();
			break;
			case 5:
				//ends the program
				System.exit(0);
			break;

		}
	}
	public void get_next_action() {
		boolean completed_action = false;	
		while (!try_user_input()) {
			
		}
	}

	public boolean try_user_input() {
		System.out.print("What would you like to do: ");	
		current_action = keyboard.nextInt();
		if (current_action<0 || current_action>actions.length-1) {
			System.out.println("Action at index " + current_action + " is invalid.");	
			System.out.println("Enter 1 to see the list of availible actions.");	
			return false;

		}
		return true;
	}

	//runs to show users what they can do
	public void give_help() {
		//draws the name of the page
		draw_line();
		System.out.println("Help Page");	
		draw_line();
		//draws the title portion of the page
		draw_line();
		System.out.println("Availible actions for you to do: ");	
		draw_line();
		//draws all the actions you can do
		for (int i=0; i<actions.length;i++) {
			//displays a seperator
			System.out.print("|");
			//displays the number related to each event
			System.out.print(i);
			//displays a seperator
			System.out.print("|");

			//prints the name of the row
			System.out.println(actions[i]);
		}
		draw_line();
	}

	//method for drawing lines of dashes to separate things
	public void draw_line() {
		for (int i=0; i<row_length;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
