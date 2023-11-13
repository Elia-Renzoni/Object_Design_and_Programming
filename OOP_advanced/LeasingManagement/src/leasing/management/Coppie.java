package leasing.management;

public class Coppie <E, F> {
	private E autovettura;
	private F proprietario;
	
	public Coppie(E autovettura, F proprietario) {
		this.autovettura = autovettura;
		this.proprietario = proprietario;
	}
	
	public E getAutovettura() {
		return this.autovettura;
	}
	
	public F getProprietario() {
		return this.proprietario;
	}
}
