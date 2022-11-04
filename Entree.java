/**
 * Class Entree
 * Jacob Wright
 * Created: 11/4/2022
 */
package jaw371_MenuManager_v2;

class Entree {
	private String name = null;
	private String description = null;
	private int nCal = 0;
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