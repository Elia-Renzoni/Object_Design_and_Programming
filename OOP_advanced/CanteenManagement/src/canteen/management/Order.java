package canteen.management;

import java.util.LinkedList;
import java.util.List;

import interfaces.Product;

public class Order <E> {
	private List<E> order;
	
	public Order() {
		this.order = new LinkedList<E>();
	}
	
	public void addProductToOrder(E product) {
		this.order.add(product);
	}
	
	public void removeProductToOrder(E product, String productName) {
		Product tmp;
		for (var values : this.order) {
			if (values instanceof E) {
				tmp = (Product)values;
				if (tmp.getProductName().equals(productName)) {
					this.order.remove((E)values);
				}
			}
		}
	}
	
	public String getOrder() {
		String toOrder = null;
		for (var values : this.order) {
			toOrder += "" + ((Product)values).getProductName();
			toOrder += "\n" + ((Product)values).getProductPrice();
			toOrder += "\n";
			
		}
		return toOrder;
	}
	
	public double engineTotalPrice() {
		double totalPrice = 0.0;
		for (var values : this.order) {
			totalPrice += ((Product)values).getProductPrice();
		}
		return totalPrice;
	}
}
