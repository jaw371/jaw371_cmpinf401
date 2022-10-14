package jaw371_MenuManager;

/**
 * Class Dessert
 * author: Jacob Wright
 * Created 10/10/2022
 */

/**
 * creation of the Dessert class
 * create String name, String description, and int number of calories
 * set the dessert's name, description, and nCal by using "this." to refer to the dessert object
 * get the dessert's name, description, and nCal by returning the value
 */

class Dessert {
	String name;
	String description;
	int nCal;
	public Dessert(String name, String description, int nCal) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}
	public String getdessertName() {
		return this.name;
	}
	public String getdessertDesc() {
		return this.description;
	}
	public int getdessertCals() {
		return this.nCal;
	}
	public void setDessertName(String name) {
		this.name = name;
	}
	public void setDessertDesc(String description) {
		this.description = description;
	}
	public void setDessertCals(int nCal) {
		this.nCal = nCal;
	}

}
