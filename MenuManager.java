/**
 * Class MenuManager
 * Jacob Wright
 * Created: 11/24/2022
 */
package jaw371_MenuManager_v3;

import java.util.ArrayList;

public class MenuManager {

	private ArrayList<Entree> entrees = new ArrayList<Entree>();

	private ArrayList<Side> sides = new ArrayList<Side>();

	private ArrayList<Salad> salads = new ArrayList<Salad>();
	private ArrayList<Dessert> desserts = new ArrayList<Dessert>();

	/**
	 * Method create ArrayList
	 * 
	 * @param fileName
	 * @return entrees, sides, salads, desserts
	 */
	public MenuManager(String dishesFile) {

		ArrayList<MenuItem> menuItems = FileManager.readItems(dishesFile);
		for (int i = 0; i < menuItems.size(); i++) {
			if (menuItems.get(i) instanceof Entree) {
				entrees.add((Entree) menuItems.get(i));
			}
			if (menuItems.get(i) instanceof Side) {
				sides.add((Side) menuItems.get(i));
			}
			if (menuItems.get(i) instanceof Salad) {
				salads.add((Salad) menuItems.get(i));
			}
			if (menuItems.get(i) instanceof Dessert) {
				desserts.add((Dessert) menuItems.get(i));
			}
		}
	}

	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	public ArrayList<Side> getSides() {
		return sides;
	}

	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	public ArrayList<Salad> getSalads() {
		return salads;
	}

	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}
