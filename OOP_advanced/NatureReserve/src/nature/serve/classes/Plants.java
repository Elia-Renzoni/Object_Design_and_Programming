package nature.serve.classes;

public class Plants extends Organism {
	private String type;
	
	public Plants(String name, int age, Habitat hab, Taxonomy classification, String type) {
		super(name, age, hab, classification);
		this.type = type;
	}

	@Override
	public String description() {
		return super.description() + " " + this.type;
	}
}
