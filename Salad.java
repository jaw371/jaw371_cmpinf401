/**
 * Class Salad
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;

class Salad {
	private String name = null;
	private String description = null;
	private int nCal = 0;
	public Salad(String name, String description, int nCal, int i) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}
	public String getsaladName() {
		return this.name;
	}
	public String getsaladDesc() {
		return this.description;
	}
	public int getsaladCals() {
		return this.nCal;
	}
	public void setSaladName(String name) {
		this.name = name;
	}
	public void setSaladDesc(String description) {
		this.description = description;
	}
	public void setSaladCals(int nCal) {
		this.nCal = nCal;
	}

}
