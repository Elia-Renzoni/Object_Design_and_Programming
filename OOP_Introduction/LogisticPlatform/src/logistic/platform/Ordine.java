package logistic.platform;

public abstract class Ordine {
	private static final String CREATO = "CREATO";
	private static final String CONSEGNATO = "CONSEGNATO";
	
	public abstract String creaNuovoOrdine();
	public abstract void modificaOrdine();
	public abstract void cancellaOrdine();
	public abstract String tracciamentoOrdine();
}
