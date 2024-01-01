package event.management.resources;

import java.util.Optional;

public class PartecipanteAnonimo extends Partecipante {
	
	public PartecipanteAnonimo() {
		super();
		super.id = super.rnd.nextInt();
	}
	
	@Override
	public String descrizionePartecipante() {
		return "Partecipante Anonimo con ID : " + super.id;
	}

	@Override
	public void aggiungiNuovoEvento(String evento) {
		if (!(evento == null)) {
			super.eventiPreferiti.add(Optional.of(evento));
		} else {
			super.eventiPreferiti.add(Optional.empty());
		}
	}

}
