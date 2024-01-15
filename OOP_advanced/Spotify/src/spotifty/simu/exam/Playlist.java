package spotifty.simu.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Playlist {
	private Map<Integer, MusicalStuff> playlist;
	
	public Playlist() {
		this.playlist = new HashMap<>();
	}
	
	public void addElement(final MusicalStuff elementToAdd) {
		if (!(this.checkIfPresent(elementToAdd.getId())))
			this.playlist.put(elementToAdd.getId(), elementToAdd);
		else 
			throw new IllegalArgumentException();
	}
	
	public void removeElement(final MusicalStuff elementToRemove) {
		if (this.checkIfRemoved(elementToRemove.getId())) {
			this.playlist.remove(elementToRemove.getId());
			if (this.checkIfRemoved(elementToRemove.getId())) {
				System.out.println("Elemento Rimosso !");
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getElementLength(final MusicalStuff element) {
		final Optional<MusicalStuff> values =  this.playlist.entrySet().stream()
				.map(Map.Entry::getValue)
				.filter(n -> n.getId() == element.getId())
				.findAny();
		return values.get().getLength();
	}
	
	public List<MusicalStuff> getElementByGenre(final String genre) {
		return this.playlist.entrySet().stream()
				.map(Map.Entry::getValue)
				.filter(n -> n.getMusicGenre().equals(genre))
				.collect(Collectors.toList());
	}
	
	public List<MusicalStuff> getElementByAuthor(final String author) {
		return this.playlist.entrySet().stream()
				.map(Map.Entry::getValue)
				.filter(n -> n.getAuthor().equals(author))
				.collect(Collectors.toList());
	}
	
	private boolean checkIfPresent(final int id) {
		return this.playlist.entrySet().stream()
				.map(Map.Entry::getValue)
				.anyMatch(n -> n.getId() == id);
	}
	
	private boolean checkIfRemoved(final int id) {
		return this.playlist.entrySet().stream()
				.map(Map.Entry::getKey)
				.anyMatch(n -> n == id);
	}
}
