/*
*	@author Elia Renzoni
*	@date 04/11/2023
*/

package banksystem;

public class Banca {
	private CartaDiCreditoStandard cartaDiCredito;
	private CartaDiCreditoCashBack cartaCashBack;
	private ContoCorrente contoCorrente;
	
	public Banca(int numero, String titolare, double limite, int numeroConto, String titolareConto, double saldo) {
		this.cartaDiCredito = new CartaDiCreditoStandard(numero, titolare, limite, numeroConto, titolareConto, saldo);
	}
	
	public Banca(int numero, String titolare, double limite, int numeroConto, String titolareConto, double saldo, boolean isCashBack) {
		this.cartaCashBack = new CartaDiCreditoCashBack(numero, titolare, limite, numeroConto, titolareConto, saldo);
	}
	
	public Banca(int numeroConto, String nomeTitolare, double saldo) {
		this.contoCorrente = new ContoCorrente(numeroConto, nomeTitolare, saldo);
	}
}
