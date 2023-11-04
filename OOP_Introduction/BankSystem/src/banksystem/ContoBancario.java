/**
*	@author Elia Renzoni
*	@date 04/11/2023
*/

package banksystem;

public abstract class ContoBancario {
	private int numeroConto;
	private String titolare;
	protected double saldo;
	
	public ContoBancario(int numero, String titolare, double saldo) {
		this.numeroConto = numero;
		this.titolare = titolare;
		this.saldo = saldo;
	}
	
	public abstract void preleva(double importo);
	public abstract void deposita(double importo);
	
	public String getTitolare() {
		return this.titolare;
	}
	
	public int getNumeroConto() {
		return this.numeroConto;
	}
	
}
