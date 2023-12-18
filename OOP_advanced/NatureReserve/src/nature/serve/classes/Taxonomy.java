package nature.serve.classes;

public enum Taxonomy {
	MAMMAL("Mammal"),
	REPTILE("Reptile"),
	MUSHROOM("Mushroom"),
	PLANTS("Plants");
	
	private String name;
	
	private Taxonomy(final String name) {
		this.name = name;
	}
	
	public String getClassification() {
		return this.name;
	}
}
