/*
 * 	@author Elia Renzoni
 * 	@date 07/10/2023
 * 	@brief Overloading dei costruttori ex.
 * */
public class Veicolo {
	public static void main(String[] args) {
		UseVeicolo veicolo = new UseVeicolo("Honda", "X-5");
		UseVeicolo nuovoVeicolo = new UseVeicolo("Fiat", "Panda", 2005);
		
		System.out.println("Informazioni Veicoli : ");
		System.out.println("Marca Primo Veicolo : " + veicolo.getMarca() + "\nMarca Secondo Veicolo : " + nuovoVeicolo.getMarca());
		System.out.println("Modello Primo Veicolo : " + veicolo.getModello() + "\nModello Secondo Veicolo : " + nuovoVeicolo.getModello());
		System.out.println("Anno di Produzione Primo Veicolo : " + veicolo.getAnnoProd() + "\nAnno di Produzione Secondo Veicolo : " + nuovoVeicolo.getAnnoProd());
	}
}
