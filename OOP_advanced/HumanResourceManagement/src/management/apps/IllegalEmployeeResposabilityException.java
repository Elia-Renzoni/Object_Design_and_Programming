package management.apps;

public class IllegalEmployeeResposabilityException extends Exception {
	private String message;
	
	public IllegalEmployeeResposabilityException() {
		this.message = "Ruoli non giusti";
	}
}
