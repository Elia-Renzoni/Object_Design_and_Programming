package logistic.platform;

public class MagazzinoConsegne extends Magazzino {
	public MagazzinoConsegne() {
		super();
	}
	
	public void aumentaProdottiConsegnati(int aumento) {
		super.prodottiConsegnati += aumento;
	}
	
	public void diminuisciProdottiConsegnati(int diminuzione) {
		super.prodottiConsegnati -= diminuzione;
	}
}
