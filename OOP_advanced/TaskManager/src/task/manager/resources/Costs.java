package task.manager.resources;

import java.util.HashMap;
import java.util.Map;

public class Costs {
	private Map<Integer, Integer> table;
	
	public Costs() {
		this.table = new HashMap<>();
	}
	
	public void addNewElement(final int hashCode, final int totalPrice) {
		this.table.put(hashCode, totalPrice);
		System.out.println("New Element Added !");
	}
	
	public Map<?, ?> getHashMap() {
		return this.table;
	}
}
