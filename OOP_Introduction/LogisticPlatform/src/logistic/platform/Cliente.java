package logistic.platform;

import java.util.Random;

public class Cliente {
	private int idCliente;
	private Random rdn;
	
	public Cliente() {
		this.rdn = new Random();
		this.idCliente = rdn.nextInt();
	}
	
	public int getIdCliente() {
		return this.idCliente;
	}
	
	public void setIdCliente(int nuovoId) {
		this.idCliente = nuovoId;
	}
}
