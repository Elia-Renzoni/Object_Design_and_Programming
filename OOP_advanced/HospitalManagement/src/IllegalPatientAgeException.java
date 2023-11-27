
public class IllegalPatientAgeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;
	public IllegalPatientAgeException(String msg) {
		this.message = msg;
	}
}
