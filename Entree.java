package jaw371_MenuManager;


/**
 * Class Entree
 * author: Jacob Wright
 * Created 10/10/2022
 */


/**
 * creation of the Entree class
 * create String name, String description, and int number of calories
 * set the entree's name, description, and nCal by using "this." to refer to the entree object
 * get the entree's name, description, and nCal by returning the value
 */
class Entree {
	String name;
	String description;
	int nCal;
	public Entree(String name, String description, int nCal) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}
	public String getentreeName() {
		return this.name;
	}
	public String getentreeDesc() {
		return this.description;
	}
	public int getentreeCals() {
		return this.nCal;
	}
	public void setEntreeName(String name) {
		this.name = name;
	}
	public void setEntreeDesc(String description) {
		this.description = description;
	}
	public void setEntreeCals(int nCal) {
		this.nCal = nCal;
	}

}



