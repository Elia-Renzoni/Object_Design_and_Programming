package pizzaManagement;

import java.io.IOException;

public class Customer extends Order {
	private final String customerName;
	private final String customerAddress;

	public Customer(String name, String[] toppings, String customerName, String customerAddress) {
		super(name, toppings);
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	public void getFinalOrder() {
		if (this.writeCustomerInfo()) {
			System.out.println("Ordine finale creato !");
		} else {
			System.out.println("Errore nella creazione dell'ordine");
		}
	}
	
	private boolean writeCustomerInfo() {
		boolean result = false;
		super.addComponent();
		try {
			super.getDatabaseName().write(this.customerName + "\n");
			super.getDatabaseName().write(this.customerAddress);
			result = true;
		} catch (IOException e) {
			System.err.println(e);		
		}
		return result;
	}

}
