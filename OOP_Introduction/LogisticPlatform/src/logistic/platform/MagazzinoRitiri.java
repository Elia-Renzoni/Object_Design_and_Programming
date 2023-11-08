package logistic.platform;

public class MagazzinoRitiri extends Magazzino {
	public MagazzinoRitiri() {
		super();
	}
	
	public void diminuisciProdottiRitirati(int diminuzione) {
		super.prodottiRitirati -= diminuzione;
	}
	
	public void aumentaProdottiRitirati(int aumento) {
		super.prodottiRitirati += aumento;
	}
}
