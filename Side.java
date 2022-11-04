package jaw371_MenuManager_v2;

class Side {
	private String name = null;
	private String description = null;
	private int nCal = 0;
	public Side(String name, String description, int nCal, int i) {
		this.name = name;
		this.description = description;
		this.nCal = nCal;
	}

	public String getsideName() {
		return this.name;
	}
	public String getsideDesc() {
		return this.description;
	}
	public int getsideCals() {
		return this.nCal;
	}
	public void setSideName(String name) {
		this.name = name;
	}
	public void setSideDesc(String description) {
		this.description = description;
	}
	public void setSideCals(int nCal) {
		this.nCal = nCal;
	}

}