package event.management.resources;

import java.util.LinkedList;
import java.util.List;

public class Evento {
	private final String nomeEvento;
	private final int dataEvento;
	private final String luogoEvento;
	private final List<String> paroleChiave;
	
	public Evento(final String nomeEvento, final int dataEvento, final String luogoEvento) {
		this.nomeEvento = nomeEvento;
		this.dataEvento = dataEvento;
		this.luogoEvento = luogoEvento;
		this.paroleChiave = new LinkedList<>();
	}
	
	public void addParoleChiave(final String parolaChiave) {
		this.paroleChiave.add(parolaChiave);
		System.out.println("Parole Chiave " + parolaChiave + "aggiunta");
	}
	
	public String getNomeEvento() {
		return this.nomeEvento;
	}
	
	public int getDataEvento() {
		return this.dataEvento;
	}
	
	public String getLuogoEvento() {
		return this.luogoEvento;
	}
	
	public List<String> getListaParoleChiave() {
		return this.paroleChiave;
	}
}
