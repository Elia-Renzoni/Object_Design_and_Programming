package pizzaManagement;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Order extends Pizza {
	private static FileWriter orderDatabase;
	private static Random rdn = new Random();
	private static int orderdId = rdn.nextInt();
	
	public Order(String name, String[] toppings) {
		super(name, toppings);
		this.createOrderFile();
	}
	
	private void createOrderFile() {
		try {
			this.orderDatabase = new FileWriter("orders.txt");
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
	public void addComponent() {
		try {
			BufferedWriter buff = new BufferedWriter(this.orderDatabase);
			buff.write(super.getPizzaName() + "\n");
			for (var values : super.getPizzaToppings())
				buff.write(values.toString() + "\n");
			buff.write(this.orderdId);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
	
	// TODO, delete a certain string algorithm
	public boolean removeComponent(String componentName) {
		return false;
	}
	
	protected FileWriter getDatabaseName() {
		return this.orderDatabase;
	}
}
