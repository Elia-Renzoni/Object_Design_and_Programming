package pizzaManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import interfaces.PizzaComponent;

public class PizzaTopping implements PizzaComponent {
	private String[] toppingNames;
	private static FileReader topp;

	public PizzaTopping(String[] names) {
		this.toppingNames = names;
		this.connectFileToppings();
	}
	
	public boolean searchTopping() {
		boolean result = false;
		try {
			BufferedReader buff = new BufferedReader(this.topp);
			String line = buff.readLine();
			while (line != null) {
				for (var values : this.toppingNames) {
					if (line == values.toString()) {
						result = true;
				} 
			}
		}
		} catch (Exception ex) {
			System.err.println(ex);
		}
		return result;
	}
	
	private void connectFileToppings() {
		try {
			this.topp = new FileReader("topping.txt");
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
	@Override
	public String getPizzaName() {
		return null;
	}

	@Override
	public double getPizzaPrice() {
		return 0;
	}

	@Override
	public String[] getPizzaToppings() {
		return this.toppingNames;
	}

}
