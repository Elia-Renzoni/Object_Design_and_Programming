/**
*	@author Elia Renzoni
*	@date 04/11/2023
*/
package banksystem;

public class ContoCorrente extends ContoBancario {
	public ContoCorrente(int numeroConto, String nomeTitolare, double saldo) {
		super(numeroConto, nomeTitolare, saldo);
	}
	
	@Override
	public void preleva(double importo) {
		if (super.saldo > 0) { 
			super.saldo -= importo;
			if (super.saldo <= 0) 
				System.out.println("Attenzione il conto, in seguito all'ultimo preliveo, si é svuotato !");
		} else 
			System.out.println("Impossibile prelevare soldi, il conto é vuoto");
	}
	
	@Override
	public void deposita(double importo) {
		super.saldo += importo;
	}
}
