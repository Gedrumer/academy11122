package by.academy.classwork.lesson13;

@Producer(country = "Belarus", founderFullName = "Belarusian", startYear = 2022)
public class Cheese {
	private double richness;

	public Cheese() {
		super();
	}

	public Cheese(String title, double price, double quantity, double richness) {
		super();
		this.richness = richness;
	}
	
	public void setRichness(double richness) {
		this.richness = richness;
	}
	@Producer(country = "Belarus", founderFullName = "Belarusian", startYear = 2022)
	public double getRichness() {
		return richness;
	}

}
