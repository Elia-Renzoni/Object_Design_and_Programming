package nature.serve.classes;

public class Organism {
	private final String name;
	private final int age;
	private final Habitat habitat;
	private final Taxonomy classification;
	
	public Organism(final String name, final int age, final Habitat hab, final Taxonomy classification) {
		this.name = name;
		this.age = age;
		this.habitat = hab;
		this.classification = classification;
	}
	
	// toString
	public String description() {
		return " " + this.name + " " + this.age + this.habitat.getHabitat()  + " " + this.classification.getClassification() + "";
	}
	
}
