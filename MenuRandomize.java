/**
 * Class MenuRandomize
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;

import java.util.ArrayList;
/**
 * Method load data from text files into the 4 ArrayLists created
 * @return randMenu
 */
public class MenuRandomize {
private ArrayList<Entree>entrees = new ArrayList<Entree>();
private ArrayList<Side>sides = new ArrayList<Side>();
private ArrayList<Salad>salads = new ArrayList<Salad>();
private ArrayList<Dessert>desserts = new ArrayList<Dessert>();

public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
	entrees = FileManager.readEntrees(entreeFile);
	sides = FileManager.readSides(sideFile);
	salads = FileManager.readSalads(saladFile);
	desserts = FileManager.readDesserts(dessertFile);
}
public Menu randomMenu() {
	Menu randMenu = new Menu("Random sample items");
	randMenu.setEntree(entrees.get((int)(entrees.size()*Math.random())));
	randMenu.setSide(sides.get((int)(sides.size()*Math.random())));
	randMenu.setSalad(salads.get((int)(salads.size()*Math.random())));
	randMenu.setDessert(desserts.get((int)(desserts.size()*Math.random())));
	
	return randMenu;
}
}