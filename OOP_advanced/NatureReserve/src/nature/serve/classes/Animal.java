package nature.serve.classes;

public class Animal extends Organism {
	private int numPaws;
	private int height;
	
	public Animal(String name, int age, Habitat hab, Taxonomy classification, int numPaws, int height) {
		super(name, age, hab, classification);
		this.numPaws = numPaws;
		this.height = height;
	}
	
	@Override
	public String description() {
		return super.description() + " " + this.numPaws + " " + this.height;
	}
}
