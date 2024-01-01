package event.management.resources;

import java.util.Comparator;
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
	
	public boolean trovaEventiPerParolaChiave(String paroleChiave) {
		final boolean result = this.partecipanti.stream()
				.anyMatch(partecipante -> partecipante.getEventiPreferiti().stream()
						.anyMatch(evento -> evento.equals(paroleChiave)));
		return result;
	}
}
