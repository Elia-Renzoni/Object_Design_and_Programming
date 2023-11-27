
public class IllegalPatientIdCodeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String message;
	
	public IllegalPatientIdCodeException(String msg) {
		this.message = msg;
	}
}
