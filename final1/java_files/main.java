public class main {
	static Inventory inventory = new Inventory(10);
	static User_events handler = new User_events();
	static Shopkeeper shopKeeper = new Shopkeeper();
	static Event_Handler events = new Event_Handler();
	public static void main(String args[]) {

		Item apple = new Item("apples", 4.35, 10);
		shopKeeper.add_item(apple);
		Item health_potions = new Item("Health Potions", 16.99, 2);
		shopKeeper.add_item(health_potions);
		inventory.add_item(apple);

		while (true) {
			events.loop();
		}
	}
}
