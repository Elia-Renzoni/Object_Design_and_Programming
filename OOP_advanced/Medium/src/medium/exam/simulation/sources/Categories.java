package medium.exam.simulation.sources;

public enum Categories {
	TECH_FIRST("Distribute System"),
	TECH_SECOND("Artificial Intelligence"),
	ART_FIRST("Caravaggio"),
	ART_SECOND("Manetti");
	
	private String category;
	
	private Categories(final String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
}
