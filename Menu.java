/**
 * Class Menu
 * Jacob Wright
 * Created: 11/4/2022
 */

package jaw371_MenuManager_v2;

public class Menu {
	String name;
	Entree entree;
	Side side;
	Salad salad;
	Dessert dessert;
	
	public Menu (String name, Entree entree1, Salad salad1) {
		this.name = name;
		this.entree = new Entree();
		this.side = new Side();
		this.salad = new Salad();
		this.dessert = new Dessert();
	}
	public Menu(String name, Entree entree, Side side) {
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = null;
		this.dessert = null;
	}
	public Menu(String name) {
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
	public int totalCalories() {
		int totalCalories = 0;
		if(this.entree!=null) {
			totalCalories += this.entree.getentreeCals();
		}
		if(this.side!=null) {
			totalCalories += this.side.getsideCals();
		}
		if(this.salad!=null) {
			totalCalories += this.salad.getsaladCals();
		}
		if(this.dessert!=null) {
			totalCalories += this.dessert.getdessertCals();
		}
		return totalCalories;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Entree getEntree() {
		return entree;
	}
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Salad getSalad() {
		return salad;
	}
	public void setSalad(Salad salad) {
	this.salad = salad;
	}
	public Dessert getDessert() {
		return dessert;
	}
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	}
	


