package logistic.platform;

import java.util.Date;

public abstract class Ordine {
	private static final String CREATO = "CREATO";
	private static final String CONSEGNATO = "CONSEGNATO";
	
	public abstract String creaNuovoOrdine();
	public abstract void modificaOrdine(int idOrdine, Date dataCreazione);
	public abstract void cancellaOrdine();
	public abstract String tracciamentoOrdine();
}
