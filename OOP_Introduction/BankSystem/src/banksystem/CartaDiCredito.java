package banksystem;

public abstract class CartaDiCredito {
	private int numeroCarta;
	private String titolareCarta;
	protected double limteDiSpesa;
	
	public CartaDiCredito(int numero, String titolare, double limite) {
		this.numeroCarta = numero;
		this.titolareCarta = titolare;
		this.limteDiSpesa = limite;
	}
	
	public abstract void effettuaPagamento(double importo);
	
	public int getNumeroCarta() {
		return this.numeroCarta;
	}
	
	public String getTitolareCarta() {
		return this.titolareCarta;
	}
}
