package jaw371_MenuManager;

/**
 * Class Salad
 * author: Jacob Wright
 * Created 10/10/2022
 */

/**
 * creation of the Salad class
 * create String name, String description, and int number of calories
 * set the salad's name, description, and nCal by using "this." to refer to the salad object
 * get the salad's name, description, and nCal by returning the value
 */

class Salad {
	String name;
	String description;
	int nCal;
	public Salad(String name, String description, int nCal) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}
	public String getsaladName() {
		return this.name;
	}
	public String getsaladDesc() {
		return this.description;
	}
	public int getsaladCals() {
		return this.nCal;
	}
	public void setSaladName(String name) {
		this.name = name;
	}
	public void setSaladDesc(String description) {
		this.description = description;
	}
	public void setSaladCals(int nCal) {
		this.nCal = nCal;
	}

}

