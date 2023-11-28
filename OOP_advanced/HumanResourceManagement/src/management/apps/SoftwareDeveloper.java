package management.apps;

public class SoftwareDeveloper extends Employee {
	private String responsability;
	
	public SoftwareDeveloper(String name, String surname) {
		super(name, surname);
		this.responsability = "Software Developer";
	}
	
	public String getResponsability() {
		return this.responsability;
	}

}
