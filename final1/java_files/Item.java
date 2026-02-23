//class that holds all item data
public class Item {
	//makes the variables for storing information
	String name;
	double price;
	int count;

	//runs on creation of item
	Item(String name, double price, int count) {
		//sets the variables to whats needed
		this.name = name;
		this.price = price;
		this.count = count;
	}
}
