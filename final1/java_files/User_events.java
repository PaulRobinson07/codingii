public class User_events {
	String[] rows = {"Name of Item", "Price", "Number of that item left"};
	int row_length = 30;
	String a = "Your Inventory";
	String b = "Shopkeeper Inventory";
	public void add_item() {
		

	}
	public void sell_item() {


	}
	//shows all the items in the user's inventory
	public void show_user_items() {
		//draws a separation line
		draw_line();
		System.out.print("|");

		//prints the name of the inventory
		System.out.print(a);

		//fills the rest of the row
		for (int j=0; j<row_length*rows.length+2-a.length();j++) {
			System.out.print(" ");
		}

		//makes a new line
		System.out.println("|");

		//draws a separation line
		draw_line();

		//starts next line
		System.out.print("|");

		// draws all the rows and their names
		for (int i=0; i<rows.length;i++) {
			//prints the name of the row
			System.out.print(rows[i]);

			//fills in the rest of the row
			for (int j=0; j<row_length-rows[i].length();j++) {
				System.out.print(" ");
			}
			//displays a seperator
			System.out.print("|");
		}

		//prints a line to separate the top and bottom of the data table
		System.out.println();

		//draws a separation line
		draw_line();

		//prints the inventory data
		main.inventory.show_items();
	}

	//draws the shopkeeper's inventory
	public void show_shopkeeper_items() {
		//draws a separation line
		draw_line();
		System.out.print("|");

		//prints the name of the inventory
		System.out.print(b);

		//fills the rest of the row
		for (int j=0; j<row_length*rows.length+2-b.length();j++) {
			System.out.print(" ");
		}

		//makes a new line
		System.out.println("|");

		//draws a separation line
		draw_line();

		//starts next line
		System.out.print("|");

		// draws all the rows and their names
		for (int i=0; i<rows.length;i++) {
			//prints the name of the row
			System.out.print(rows[i]);

			//fills in the rest of the row
			for (int j=0; j<row_length-rows[i].length();j++) {
				System.out.print(" ");
			}
			//displays a seperator
			System.out.print("|");
		}

		//prints a line to separate the top and bottom of the data table
		System.out.println();

		//draws a separation line
		draw_line();

		//prints the inventory data
		main.shopKeeper.show_items();
	}

	//draws a variable in a row
	public void draw_variable(String s) {
		//renders the name of the variable
		System.out.print(s);

		//fills in the rest of the row
		for (int j=0; j<row_length-s.length();j++) {
			System.out.print(" ");
		}

		//draws a seperator
		System.out.print("|");
	}

	//draws a seperator line
	public void draw_line() {
		//goes for the length of the rows combined to fill it in
		for (int i=0; i<rows.length*row_length+1+rows.length;i++) {
			System.out.print("-");
		}

		//makes a new line
		System.out.println();
	}
}
