package event.management.resources;

import java.util.Optional;

public class UtenteRegistrato extends Partecipante {
	private String userName;
	
	public UtenteRegistrato(final String userName) {
		super();
		this.userName = userName;
		super.id = super.rnd.nextInt();
	}
	
	@Override
	public String descrizionePartecipante() {
		return "Partecipante Registrato con username : " + this.userName + " e ID : " + super.id;
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
