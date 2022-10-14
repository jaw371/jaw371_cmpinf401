package jaw371_MenuManager;

/**
 * Class Menu
 * author: Jacob Wright
 * Created 10/10/2022
 */

/**
 * Menu class is created to contain one object of each of the previous classes
 *
 */

public class Menu{
	String name;
	Entree entree;
	Side side;
	Salad salad;
	Dessert dessert;
	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.entree = entree;
		this.side = null;
		this.salad = salad;
		this.dessert = null;
	}
	public Menu(String name, Side side, Salad salad) {
		this.name = name;
		this.entree = null;
		this.side = side;
		this.salad = salad;
		this.dessert = null;
	}
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}
	/**
	 * method totalCals() is created to add the total number of calories together
	 * if the item does not equal null, get number of calories from the item, and add it to the 0 value of totalCals
	 * at the end return the new value of totalCals
	 */
	public int totalCals() {
		int totalCals = 0;
		if(this.entree!=null) {
			totalCals += this.entree.getentreeCals();
		}
		if(this.side!=null) {
			totalCals += this.side.getsideCals();
		}
		if(this.salad!=null) {
			totalCals += this.salad.getsaladCals();
		}
		if(this.dessert!=null) {
			totalCals += this.dessert.getdessertCals();
		}
		return totalCals;
	}
	/**
	 * description method is created to concatenate parts of the menu in order
	 * create an empty string named description
	 * create new lines to separate the descriptions
	 * if the item does not equal null, concatenate the item with the description
	 * else, the item will be listed as N/A
	 * have a new line created at the end for separation
	 * return the description at the end
	 */
	public String description() {
		String description = "";
		description+=this.name;
		description+="\n";
		if(this.entree!=null) {
			description += "Entree: " + this.entree.getentreeDesc();
		}
		else
		{
			description += "Entree: N/A";
		}
		description+="\n";
		if(this.side!=null) {
			description += "Side: " + this.side.getsideDesc();
		}
		else
		{
			description += "Side: N/A";
		}
		description+="\n";
		if(this.salad!=null) {
			description += "Salad: " + this.salad.getsaladDesc();
		}
		else
		{
			description += "Salad: N/A";

		}
		description+="\n";
		if(this.dessert!=null) {
			description += "Dessert: " + this.dessert.getdessertDesc();
		}
		else
		{
			description += "Dessert: N/A";
		}
		description+="\n";
		return description;
	}
}