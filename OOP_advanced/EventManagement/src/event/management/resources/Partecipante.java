package event.management.resources;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public abstract class Partecipante {
	protected int id;
	protected Random rnd = new Random();
	protected LinkedList<Optional<String>> eventiPreferiti = new LinkedList<>();
	
	public abstract String descrizionePartecipante();
	public abstract void aggiungiNuovoEvento(String evento);
	
	public List<?> getEventiPreferiti() {
		return this.eventiPreferiti;
	}
	
	public int getId() {
		return this.id;
	}
}
