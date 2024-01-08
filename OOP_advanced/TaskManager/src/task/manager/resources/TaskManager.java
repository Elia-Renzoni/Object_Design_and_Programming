package task.manager.resources;

import java.util.LinkedList;
import java.util.List;

public class TaskManager {
	private List<Asignee> project;
	private final int budget;
	private int projectPrice;
	
	public TaskManager(final int budget) {
		this.project = new LinkedList<>();
		this.budget = budget;
	}
	
	public void visitTeamProject() {
		project.stream()
				.forEachOrdered(n -> System.out.println(n.getName() + " " + n.getTotalPrice()));
	}
	
	public int totalProjectPrice() {
		this.projectPrice = this.project.stream()
				.mapToInt(n -> n.getTotalPrice())
				.sum();
		return this.projectPrice;
	}
	
	public void checkBudget() throws BudgetException {
		if (this.projectPrice > this.budget)
			throw new BudgetException();
		else 
			System.out.println("All ok  !");
	}
	
	public int getBudget() {
		return this.budget;
	}
	
}
