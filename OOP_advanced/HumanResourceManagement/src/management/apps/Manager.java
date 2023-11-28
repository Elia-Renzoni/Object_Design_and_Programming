package management.apps;

public class Manager extends Employee {
	private String responsability;

	public Manager(String name, String surname) {
		super(name, surname);
		this.responsability = "Manager";
	}
	
	public String getResponsability() {
		return this.responsability;
	}

}
