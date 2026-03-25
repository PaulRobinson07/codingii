//class that holds all the items the user has access to
public class Inventory {
	//variables for storing items
	Item[] inventory_slots;
	int inventory_size;

	//runs on creation of the inventory
	Inventory(int size_of_inventory) {
		//sets the size of the inventory
		inventory_slots = new Item[size_of_inventory];	
		inventory_size = size_of_inventory;

		//makes the inventory empty
		for (int i=0; i<inventory_size;i++) {
			inventory_slots[i] = new Item("",0.0,0);
		}
	}

	//shows the names and prices of all the items
	public void show_items() {
		for (int i=0; i<inventory_size; i++) {
			System.out.print("|");
			main.handler.draw_variable(inventory_slots[i].name);
			main.handler.draw_variable(String.valueOf(inventory_slots[i].price));
			main.handler.draw_variable(String.valueOf(inventory_slots[i].count));
			System.out.println();
		}
	}
	public void add_item(Item item) {
		for (int i=0; i<inventory_size; i++) {
			if (item.name == inventory_slots[i].name) {
				inventory_slots[i].count+=item.count;
				return;
			}
		}
		for (int i=0; i<inventory_size; i++) {
			if (inventory_slots[i].name == "") {
				inventory_slots[i].name=item.name;
				inventory_slots[i].price=item.price;
				inventory_slots[i].count=item.count;
				return;
			}
		}
	}
	public void sell_item(String item_name) {
		for (int i=0; i<inventory_size; i++) {
			if (item_name.equals(inventory_slots[i].name)) {
				Item item = new Item(inventory_slots[i].name,inventory_slots[i].price,inventory_slots[i].count);
				main.shopKeeper.add_item(item);
				inventory_slots[i].name="";
				inventory_slots[i].price=0.0;
				inventory_slots[i].count=0;
				return;
			}
		}
		System.out.println("You do not seem to have that item");
		System.out.println("Enter 0 for the list of commands and 3 to see your inventory");
	}
}
