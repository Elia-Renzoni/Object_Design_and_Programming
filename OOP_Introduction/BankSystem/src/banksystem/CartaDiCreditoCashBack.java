package banksystem;

public class CartaDiCreditoCashBack extends CartaDiCreditoStandard {
	private static final double PERCENTUALE = 0.60;
	
	public CartaDiCreditoCashBack(int numero, String titolare, double limite, int numeroConto, String titolareConto, double saldo) {
		super(numero, titolare, limite, numeroConto, titolareConto, saldo);
	}
	
	public double calcoloCashBack(double importo) {
		double importoCash = 0.0;
		if (super.controllaLimitePagamenti()) { 
			super.effettuaPagamento(importo);
			importoCash = importo * CartaDiCreditoCashBack.PERCENTUALE;
			super.getContoCorrente().deposita(importoCash);
		}
		return importoCash;
	}
	
}
