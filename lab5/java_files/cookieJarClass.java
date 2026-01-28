//handles and stores all variables and functionality of cookie jars
public class cookieJarClass {
	//vars for storing cookie data
	public static int max_capacity;
	public static int cookie_count;

	//constructor for storing max capacity
	cookieJarClass(int capacity) {
		max_capacity = capacity;
	}

	//gives the space left in the cookie jar
	public int spaceLeft() {
		return max_capacity-cookie_count;
	}

	//determines whether the cookie jar is full and tells the user
	public boolean isFull() {
		if (spaceLeft()<=0) {
			//prompts the user that their cookie jar is full
			System.out.println("This cookie jar is full. Either remove some cookies or get a new jar");

			//returns that the cookie jar is full
			return true;
		}
		
		//tells the user the space left
		System.out.println("This cookie jar has " + spaceLeft() + " space left for cookies");

		//finishes the method by returning that the cookie jar is not full
		return false;
	}

	//adds cookies to the cookie jar and gets the room left
	public void addCookies(int cookies) {
		cookie_count+=cookies;
		isFull();
	}
}
