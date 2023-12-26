package campus.management.resources;

public class Pair<String, Integer> {
	private String className;
	private Integer cfu;
	
	public Pair(final String className, final Integer cfu) {
		this.className = className;
		this.cfu = cfu;
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public Integer getCFU() {
		return this.cfu;
	}
}
