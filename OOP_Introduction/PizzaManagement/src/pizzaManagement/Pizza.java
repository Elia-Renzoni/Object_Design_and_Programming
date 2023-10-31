package pizzaManagement;

import interfaces.PizzaComponent;
import java.util.Random;

public class Pizza implements PizzaComponent {
	private String pizzaName;
	private static Random rdn = new Random();
	private static double price = rdn.nextInt();
	private PizzaTopping toppings;
	private String endedPizza;
	
	public Pizza(String name, String[] toppings) {
		this.toppings = new PizzaTopping(toppings);
		this.pizzaName = name;
	}
	
	public void addTopping() {
		if (toppings.searchTopping()) {
			for (var values : toppings.getPizzaToppings()) {
				endedPizza += values + "\n"; 
			}
		}
	}
	
	public String getEndedPizza() {
		return this.endedPizza;
	}
	
	
	@Override
	public String getPizzaName() {
		return this.pizzaName;
	}

	@Override
	public double getPizzaPrice() {
		return this.price;
	}

	@Override
	public String[] getPizzaToppings() {
		return this.toppings.getPizzaToppings();
	}
	
}
