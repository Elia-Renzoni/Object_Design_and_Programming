/*
 * 	@author Elia Renzoni
 * 	@date 07/10/2023
 * 	@brief Overloading dei costruttori ex.
 * */

public class UseVeicolo {
	private String marca;
	private String modello;
	private int annoProduzione;
	
	UseVeicolo(String marca, String modello, int produzioneAnno) {
		this.marca = marca;
		this.modello = modello;
		this.annoProduzione = produzioneAnno;
	}
	
	UseVeicolo(String marca, String modello) {
		this(marca, modello, 0);
	}
	
	// getter
	public String getMarca() {
		return this.marca;
	}
	
	public String getModello() {
		return this.modello;
	}
	
	public int getAnnoProd() {
		return this.annoProduzione;
	}
}
