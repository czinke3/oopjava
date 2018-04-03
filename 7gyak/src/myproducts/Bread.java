package myproducts;

public class Bread extends Product {
	private double amount;
	
	public Bread(String name, int netPrice, int percentage, double amount) {
		super(name, netPrice, percentage);
		this.amount = amount;
	}
	
	public String toString() {
		return super.toString() + " egységár: " + (this.getGrossPrice() / this.amount);
	}
	

}
