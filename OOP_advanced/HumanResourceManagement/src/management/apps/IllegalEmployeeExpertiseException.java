package management.apps;

public class IllegalEmployeeExpertiseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public IllegalEmployeeExpertiseException() {
		this.message = "Esperienze errate";
	}
}
