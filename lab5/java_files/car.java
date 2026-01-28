//stores all the data and methods related to cars
public class car {
	//vars for storing car data
	public static int max_capacity;
	public static int miles_driven;
	public static int miles_since_last_oil_change = 0;

	//constructor for getting and storing data related to the car
	car(int miles_measured, int max_miles_oil_change,int miles_since_change) {
		miles_driven = miles_measured;
		max_capacity = max_miles_oil_change;
		miles_since_last_oil_change = miles_since_change;
	}

	//gives the miles left until oil refill
	public int refillMilesLeft() {
		return max_capacity-miles_since_last_oil_change;
	}

	//determines whether the car needs to change it's oil
	public boolean oilChangeNeeded() {
		if (refillMilesLeft()<=0) {
			//prompts the user that their oil needs to be changed
			System.out.println("The car needs to have it's oil changed. Please do so soon to prevent damage to the car.");

			//returns that the oil needs to be changed
			return true;
		}
		
		//tells the user the miles left until a oil change is recommended
		System.out.println("The car has " + refillMilesLeft() + " miles left until a oil change should take place.");

		//returns that the oil doesn't need to be changed
		return false;
	}

	//adds miles to the odometer
	public void addMiles(int miles) {
		miles_driven+=miles;
		miles_since_last_oil_change+=miles;
		oilChangeNeeded();
	}
}
