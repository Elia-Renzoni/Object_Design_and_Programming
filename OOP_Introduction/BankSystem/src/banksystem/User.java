package banksystem;

public class User {
	public static void main(String[] args) {
		// Simple Test
		Banca banca = new Banca(12, "Giacomo", 3000.45);
		banca.getConto().deposita(300);
		banca.getConto().preleva(30);
		System.out.println("Titolare Conto :" + banca.getConto().getTitolare());
		
		
		Banca bb = new Banca(34, "Francesco", 5000.00, 56, "Francesco", 70000.00);
		bb.getCarta().effettuaPagamento(500);
		System.out.println("Titolare Carta : "  + bb.getCarta().getTitolareCarta());
		System.out.println("Titolare del Conto :" + bb.getCarta().getContoCorrente().getTitolare());
		
	}
}
