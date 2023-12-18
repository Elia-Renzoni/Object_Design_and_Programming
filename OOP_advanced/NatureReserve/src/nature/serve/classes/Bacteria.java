package nature.serve.classes;

public class Bacteria extends Organism {
	private String type;
	public Bacteria(String name, int age, Habitat hab, Taxonomy classification, String type) {
		super(name, age, hab, classification);
		this.type = type;
	}
	
	@Override
	public String description() {
		return super.description() + " " + this.type;
	}

}
