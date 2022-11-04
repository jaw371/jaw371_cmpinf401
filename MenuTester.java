/**
 * Class MenuTest
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;
/
public class MenuTester{
	public static void main(String[] args){
		MenuRandomize randomize = new MenuRandomize("data/entrees.txt",
			"data/sides.txt","data/salads.txt","data/desserts.txt");
		Menu myMenu = randomize.randomMenu();
		System.out.println(myMenu.description()+"\nTotal calories"+
							myMenu.totalCalories());
	}
}
