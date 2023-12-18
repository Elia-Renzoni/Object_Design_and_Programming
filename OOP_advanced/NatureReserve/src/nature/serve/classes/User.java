package nature.serve.classes;

public class User {
	public static void main(String ...args) {
		Animal wolf = new Animal("wolf1", 7, Habitat.WOOD, Taxonomy.MAMMAL, 4, 7);
		Plants pl = new Plants("kk2", 56, Habitat.SEA_CLIFF, Taxonomy.PLANTS, "Bletilla Stirata");
		
		System.out.println(wolf.description());
		System.out.println(pl.description());
		
		Reserve<Organism> res = new Reserve<>();
		res.addOrganims(pl);
		res.addOrganims(wolf);
		
		
	}
}
