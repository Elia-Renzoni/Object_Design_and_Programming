package datacenter.resources;

public class BookingFaultException extends Exception {
	private String message;
	
	public BookingFaultException(final String errorMessage) {
		super(errorMessage);
		this.message = errorMessage;
	}
	
	public String getErrorMessage() {
		return this.message;
	}
}
