package jaw371_MenuManager;

/**
 * Class Side
 * author: Jacob Wright
 * Created 10/10/2022
 */

/**
 * creation of the Side class
 * create String name, String description, and int number of calories
 * set the side's name, description, and nCal by using "this." to refer to the side object
 * get the side's name, description, and nCal by returning the value
 */

class Side {
	String name;
	String description;
	int nCal;
	public Side(String name, String description, int nCal) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}
	public String getsideName() {
		return this.name;
	}
	public String getsideDesc() {
		return this.description;
	}
	public int getsideCals() {
		return this.nCal;
	}
	public void setSideName(String name) {
		this.name = name;
	}
	public void setSideDesc(String description) {
		this.description = description;
	}
	public void setSideCals(int nCal) {
		this.nCal = nCal;
	}

}


