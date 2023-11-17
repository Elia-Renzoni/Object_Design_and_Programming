package canteen.management;
import interfaces.Product;

public class Drink implements Product {
	private String name;
	private double price;
	private int volume;
	
	public Drink(String name, double price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}

	@Override
	public String getProductName() {
		return this.name;
	}

	@Override
	public double getProductPrice() {
		return this.price;
	}
	
	public int getDrinkVolume() {
		return this.volume;
	}
}
