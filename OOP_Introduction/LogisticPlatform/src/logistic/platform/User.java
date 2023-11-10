package logistic.platform;

import java.util.Random;

public class User {
	public static void main(String[] args) {
		Random rnd = new Random();
		OrdineDiConsegna ordine = new OrdineDiConsegna(rnd.nextInt(0, 500), "Sedia X-12", 23);
		System.out.println(ordine.creaNuovoOrdine());
		ordine.cancellaOrdine();
		System.out.println(ordine.tracciamentoOrdine());
		
		OrdineDiRitiro ordineArr = new OrdineDiRitiro(rnd.nextInt(0, 500), "Tavolo S-67", 1);
		System.out.println();
		System.out.println(ordineArr.creaNuovoOrdine());
	}
}
