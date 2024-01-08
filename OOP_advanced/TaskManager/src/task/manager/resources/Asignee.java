package task.manager.resources;

import java.util.ArrayList;
import java.util.List;

public class Asignee <E extends Task> {
	private List<E> tasks;
	private String name;
	private int price;
	private int totalPrice;
	private Costs costs;
	
	public Asignee(final int price, final Costs costs, final String name) {
		this.price = price;
		this.tasks = new ArrayList<>();
		this.costs = costs;
		this.name = name;
	}
	
	public void addNewTask(E newTask) {
		this.tasks.add(newTask);
		System.out.println("Task Added");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTotalPrice() {
		final long elements = this.tasks.stream()
				.count();
		this.totalPrice = (int)elements * price;
		return this.totalPrice;
	}
	
	public int hashCode() {
		return this.hashCode();
	}
	
	public boolean equals(final Object o) {
		if (o != null) {
			final Asignee as = (Asignee)o;
			if (this.hashCode() == o.hashCode())
				return true;
		}
		return false;
	}	
}
