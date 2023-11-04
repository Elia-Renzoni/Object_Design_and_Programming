package banksystem;

public class CartaDiCreditoStandard extends CartaDiCredito {
	private double importSpesoComplessivo;
	private ContoCorrente conto;
	
	public CartaDiCreditoStandard(int numero, String titolare, double limite, int numeroConto, String titolareConto, double saldo) {
		super(numero, titolare, limite);
		this.importSpesoComplessivo = 0;
		this.conto = new ContoCorrente(numeroConto, titolareConto, saldo);
	}
	
	@Override
	public void effettuaPagamento(double importo) {
		if (this.controllaLimitePagamenti()) {
			conto.preleva(importo);
			this.importSpesoComplessivo += importo;
		} else {
			System.out.println("Impossibile effettuare il pagamento");
		}
	}
	
	protected boolean controllaLimitePagamenti() {
		if (this.importSpesoComplessivo <= super.limteDiSpesa) {
			return true;
		} else {
			return false;
		}
	}
	
	public ContoCorrente getContoCorrente() {
		return this.conto;
	}
}
