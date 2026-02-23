import java.util.ArrayList;

public class Shopkeeper {
	ArrayList<Item> inventory = new ArrayList<>();
	public void add_item(Item item) {
		if (!inventory.isEmpty()) {
			inventory.add(item);
			return;
		}
		for (int i=0;i<inventory.size()-1;i++) {
			if (inventory.get(i).name == item.name) {
				inventory.get(i).count = inventory.get(i).count+item.count;
				return;
			}
		}
		inventory.add(item);
	}
	public void show_items() {
		if (!inventory.isEmpty()) {
			for (int i=0; i<inventory.size(); i++) {
				System.out.print("|");
				main.handler.draw_variable(inventory.get(i).name);
				main.handler.draw_variable(String.valueOf(inventory.get(i).price));
				main.handler.draw_variable(String.valueOf(inventory.get(i).count));
				System.out.println();
			}
		}
	}
}
