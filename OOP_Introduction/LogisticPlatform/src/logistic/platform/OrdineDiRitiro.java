package logistic.platform;

import java.util.Date;

public class OrdineDiRitiro extends Ordine {
	private int idOrdine;
	private Date dataCreazione;
	private String dataConsegna;
	private String statoOrdine;
	private Prodotto prodotto;
	private Cliente cliente;
	private MagazzinoRitiri magazzino;
	
	public OrdineDiRitiro(int idProdotto, String nomeProdotto, int qntProdotto) {
		this.prodotto = new Prodotto(idProdotto, nomeProdotto, qntProdotto);
		this.cliente = new Cliente();
		this.magazzino = new MagazzinoRitiri();
	}

	@Override
	public String creaNuovoOrdine() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void cancellaOrdine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String tracciamentoOrdine() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificaOrdine(int idOrdine, Date dataCreazione) {
		// TODO Auto-generated method stub
		
	}

}
