package management.apps;

public class IllegalEmployeeResposabilityException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IllegalEmployeeResposabilityException() {
		super("Ruoli non giusti");
	}
}
