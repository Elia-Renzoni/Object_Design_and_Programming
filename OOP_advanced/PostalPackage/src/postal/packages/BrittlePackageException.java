package postal.packages;

public class BrittlePackageException extends Exception {
	private String messaggio;
	
	public BrittlePackageException(String messaggio) {
		this.messaggio = messaggio;
	}
}
