package canteen.management;
import java.util.List;

import interfaces.Product;

public class Dish implements Product{
	private String name;
	private double price;
	List<String> ingredients;
	
	public Dish(String name, double price, List<String> ingredients) {
		this.name = name;
		this.price = price;
		this.ingredients = ingredients;
	}
	
	@Override
	public String getProductName() {
		return this.name;
	}
	
	@Override
	public double getProductPrice() {
		return this.price;
	}
	
	public String getIngredients() {
		String ingredients = null;
		for (var ingredient : this.ingredients) {
			ingredients += ingredient;
		}
		return ingredients;
	}
	

}
