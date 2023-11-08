package logistic.platform;

import java.util.Random;

public class Prodotto {
	private int idProdotto;
	private String nomeProdotto;
	private int quantitaProdotto;
	
	public Prodotto(int idProdotto, String nomeProdotto, int qntProdotto) {
		this.idProdotto = idProdotto;
		this.nomeProdotto = nomeProdotto;
		this.quantitaProdotto = qntProdotto;
	}
	
	public int getIdProdotto() {
		return this.idProdotto;
	}
	
	public String getNomeProdotto() {
		return this.nomeProdotto;
	}
	
	public int getQntProdotto() {
		return this.quantitaProdotto;
	}
	
	public void setIdProdotto(int id) {
		this.idProdotto = id;
	}
	
	public void setNomeProdotto(String nome) {
		this.nomeProdotto = nome;
	}
	
	public void setQuantitaProdotto(int qnt) {
		this.quantitaProdotto = qnt;
	}
}

