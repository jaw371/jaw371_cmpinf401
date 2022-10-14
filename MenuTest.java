package jaw371_MenuManager;

/**
 * Class MenuTest
 * author: Jacob Wright
 * Created 10/10/2022
 */

/**
 * Purpose of this class is to test the Menu class
 * We create 2 entrees, 1 side, 2 salads, and 1 dessert
 *Both menus are printed, menu name, description of the item, and the total calories
 */
public class MenuTest {

	public static void main(String[] args) {
		Entree entree1 = new Entree("entree1 name","entree1 desc",0);
		Entree entree2 = new Entree("entree2 name","entree2 desc",0);
		Side side = new Side("side name","side desc",0);
		Salad salad1 = new Salad("salad1 name","salad1 desc",0);
		Salad salad2 = new Salad("salad2 name","salad2 desc",0);
		Dessert dessert = new Dessert("dessert name","dessert desc",0);
		Menu menu1= new Menu("Menu1 name",entree1,salad1);
		System.out.println(menu1.description());
		System.out.println(menu1.totalCals());

		Menu menu2 = new Menu("Menu2 name",entree2,side,salad2,dessert);
		System.out.println(menu2.description());
		System.out.println(menu2.totalCals());

	}

}
