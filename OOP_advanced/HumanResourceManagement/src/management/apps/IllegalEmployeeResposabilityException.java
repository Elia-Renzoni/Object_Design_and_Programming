package management.apps;

public class IllegalEmployeeResposabilityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	
	public IllegalEmployeeResposabilityException() {
		super();
		this.message = "Ruoli non giusti";
	}
}
