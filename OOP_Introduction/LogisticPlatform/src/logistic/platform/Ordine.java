package logistic.platform;

import java.util.Date;

public abstract class Ordine {
	protected static final String CREATO = "CREATO";
	protected static final String CANCELLATO = "CANCELLATO";
	
	public abstract String creaNuovoOrdine();
	public abstract void modificaOrdine(int idOrdine, Date dataCreazione);
	public abstract void cancellaOrdine();
	public abstract String tracciamentoOrdine();
}
