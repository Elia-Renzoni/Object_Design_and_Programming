package leasing.management;

import java.util.LinkedList;
import java.util.Set;

public class Flotta <E, F> {
	private LinkedList flotta;
	
	public Flotta(E autovetture, F proprietario) {
		this.flotta = new LinkedList<Coppie<E, F>>();
	}
	
	public void addElement(E autovettura, F proprietario) {
		this.flotta.add(new Coppie<E, F>(autovettura, proprietario));
		System.out.println("Elemento aggiunto alla Flotta !");
	}
	
	public void ricercaAutovettura(String tipoAutovettura) {
		// TODO
	}
	
}
