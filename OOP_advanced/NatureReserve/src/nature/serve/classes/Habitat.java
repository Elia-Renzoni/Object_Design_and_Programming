package nature.serve.classes;

public enum Habitat {
	SEA_WATER("Sea Water"),
	SEA_CLIFF("Sea Cliff"),
	SWAMPS("Swamps"),
	STEPPE("Steppe"),
	LANDS("Lands"),
	WOOD("Woods");
	
	private String habitatName;
	
	private Habitat(String habitat) {
		this.habitatName = habitat;
	}
	
	public String getHabitat() {
		return this.habitatName;
	}
	
}
