package spotifty.simu.exam;

import java.util.LinkedList;
import java.util.List;

public class Album implements MusicalStuff {
	private List<Song> albumSongs;
	private final int albumId;
	private final String albumTitle;
	private final String albumAuthor;
	private final String albumGenre;
	private int length;
	
	public Album(final int id, final String title, final String author, final String genre) {
		this.albumSongs = new LinkedList<>();
		this.albumId = id;
		this.albumTitle = title;
		this.albumAuthor = author;
		this.albumGenre = genre;
		this.length = this.getLength();
	}
	
	public void addSongToAlbum(final Song songToAdd) {
		this.albumSongs.add(songToAdd);
		System.out.println("New Song added");
	}
	
	public void viewAlbum() {
		this.albumSongs.stream()
			.forEachOrdered(n -> System.out.println(n.getTitle() + " " +  n.getAuthor() + " " + n.getMusicGenre()));
	}
	
	@Override
	public int getId() {
		return this.albumId;
	}

	@Override
	public String getTitle() {
		return this.albumTitle;
	}

	@Override
	public String getAuthor() {
		return this.albumAuthor;
	}

	@Override
	public String getMusicGenre() {
		return this.albumGenre;
	}

	@Override
	public int getLength() {
		return this.albumSongs.stream()
				.mapToInt(n -> n.getLength())
				.sum();
	}

}
