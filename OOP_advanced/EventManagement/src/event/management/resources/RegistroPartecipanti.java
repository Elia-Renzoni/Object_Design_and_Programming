package event.management.resources;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class RegistroPartecipanti<E extends Partecipante> {
	private Set<E> partecipanti;
	private List<Optional<Evento>> partecipantiPerEventoPreferito;
	
	public RegistroPartecipanti() {
		this.partecipanti = new TreeSet<>((el1, el2) -> el1.getId() - el2.getId());
		this.partecipantiPerEventoPreferito = new LinkedList<>();
	}
	
	public void aggiungiPartecipante(E partecipante) {
		this.partecipanti.add(partecipante);
		System.out.println("Nuovo Partecipante : " + partecipante.descrizionePartecipante());
	}
	
	
	public static class RegistroEventiPartecipanti<E extends Partecipante> extends RegistroPartecipanti { 
		private HashMap<Evento, List<Optional<E>>> tracciaEventi;
		
		public RegistroEventiPartecipanti() {
			super();
			this.tracciaEventi = new HashMap<>();
		}
		
		public void aggiungiCoppia(final Evento e, final List<Optional<E>> partecipanti) {
			this.tracciaEventi.put(e, partecipanti);
			System.out.println("Nuova coppia aggiunta");
		}
		
		public List<Optional<E>> trovaPartecipantePerNomeEvento(final String nomeEvento) {
			// TODO
			return null;
		}
	}
}
