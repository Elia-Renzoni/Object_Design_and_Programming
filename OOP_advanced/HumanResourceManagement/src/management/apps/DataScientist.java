package management.apps;

public class DataScientist extends Employee {
	private String responsability;
	
	public DataScientist(String name, String surname) {
		super(name, surname);
		this.responsability = "Data Scientist";
	}
	
	public String getResponsability() {
		return this.responsability;
	}

}
