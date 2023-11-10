package logistic.platform;

import java.util.Date;
import java.util.Random;

public class OrdineDiConsegna extends Ordine {
	private int idOrdine;
	private Date dataCreazione;
	private Date dataConsegna;
	private String statoOrdine;
	private Prodotto prodotto;
	private Cliente cliente;
	private MagazzinoConsegne magazzino;
	private Random rdn;
	
	public OrdineDiConsegna(int idProdotto, String nomeProdotto, int qntProdotto, int prodotti) {
		this.prodotto = new Prodotto(idProdotto, nomeProdotto, qntProdotto);
		this.cliente = new Cliente();
		this.magazzino = new MagazzinoConsegne();
		this.rdn = new Random();
		this.idOrdine = rdn.nextInt();
		this.dataCreazione = new Date();
		this.dataConsegna = new Date();
	}
	
	
	@Override
	public String creaNuovoOrdine() {
		String template = null;
		this.statoOrdine = super.CREATO;
		this.magazzino.aumentaProdottiConsegnati(1);
		template = "Nome :" + this.prodotto.getNomeProdotto() + "\n"
					+ "Id : " + this.prodotto.getIdProdotto() + "\n"
					+ "Quantita del Prodotto :" + this.prodotto.getQntProdotto()  + "\n" 
					+ "Id ordine :" + this.idOrdine + "\n"
					+ "Data Creazione : " + this.dataCreazione + "\n"
					+ "Data Consegna : " + this.dataConsegna;
		return template;
	}

	@Override
	public void modificaOrdine(int idOrdine, Date dataCreazione) {
		this.idOrdine = idOrdine;
		this.dataCreazione = dataCreazione;
	}

	@Override
	public void cancellaOrdine() {
		this.magazzino.diminuisciProdottiConsegnati(1);
		this.statoOrdine = super.CANCELLATO;
		this.idOrdine = -1;
		this.prodotto.setNomeProdotto(null);
		this.prodotto.setQuantitaProdotto(0);
		this.prodotto.setQuantitaProdotto(0);
		
	}

	@Override
	public String tracciamentoOrdine() {
		return this.statoOrdine;
	}

}
