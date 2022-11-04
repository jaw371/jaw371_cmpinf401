/**Class Dessert
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;

class Dessert {
	private String name = null;
	private String description = null;
	private int nCal = 0;
	public Dessert(String name, String description, int nCal, int i) {
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