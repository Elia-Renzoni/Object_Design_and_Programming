package management.apps;

public class EmbedeedSoftwareEngineer extends Employee {
	private String responsability;
	
	public EmbedeedSoftwareEngineer(String name, String surname) {
		super(name, surname);
		this.responsability = "Embedeed Software Engineer";
	}
	
	public String getResponsability() {
		return this.responsability;
	}

}
