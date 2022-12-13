package jaw371_FinalProject;

public class MenuItem {
		private String name;
		private String description;
		private int calories;
		private double price;

	

		/**
		 * Method getters and setters
		 * 
		 * @param String name, String desc, int cal, double price
		 * @return name, description, calories, and price
		 */
	public MenuItem(String name, String desc, int cal, double price) {
			setName(name);
			setDescription(desc);
			setCalories(cal);
			setPrice(price);
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getCalories() {
			return this.calories;
		}

		public void setCalories(int calories) {
			this.calories = calories;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		/**
		 * Method Override
		 * 
		 * @param none
		 * @return name
		 */
		@Override
		public String toString() {
			return this.name;
		}
	}
	
