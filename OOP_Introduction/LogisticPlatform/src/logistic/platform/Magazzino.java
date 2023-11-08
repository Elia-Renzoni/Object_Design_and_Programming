package logistic.platform;

import java.util.Random;

public class Magazzino {
	protected int prodottiConsegnati;
	protected int prodottiRitirati;
	private int idMagazzino;
	private Random rdn;
	
	public Magazzino() {
		this.rdn = new Random();
		this.idMagazzino = rdn.nextInt();
	}
	
	public int getIdMagazzino() {
		return this.idMagazzino;
	}
	
	public void setIdMagazzino(int nuovoId) {
		this.idMagazzino = nuovoId;
	}
	
}
