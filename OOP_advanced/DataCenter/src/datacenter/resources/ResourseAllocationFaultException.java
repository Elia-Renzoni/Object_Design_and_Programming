package datacenter.resources;

public class ResourseAllocationFaultException extends Exception {
	private String message;
	
	public ResourseAllocationFaultException(final String errorMessage) {
		super(errorMessage);
		this.message = errorMessage;
	}
	
	public String getErrorMessage() {
		return this.message;
	}
}
