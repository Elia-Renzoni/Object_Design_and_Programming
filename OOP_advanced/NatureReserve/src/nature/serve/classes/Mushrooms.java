package nature.serve.classes;

public class Mushrooms extends Organism {
	private String type;
	
	public Mushrooms(String name, int age, Habitat hab, Taxonomy classification, String type) {
		super(name, age, hab, classification);
	}

	@Override
	public String description() {
		return super.description() + " " + this.type;
	}
}
