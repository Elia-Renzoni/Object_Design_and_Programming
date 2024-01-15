package spotifty.simu.exam;

public class Song implements MusicalStuff {
	private final int songId;
	private final String songTitle;
	private final String songAuthor;
	private final String musicGenre;
	private final int length;
	
	public Song(final int songId, final String title, final String author, final String genre, final int length) {
		this.songId = songId;
		this.songTitle = title;
		this.songAuthor = author;
		this.musicGenre = genre;
		this.length = length;
	}
	
	@Override
	public int getId() {
		return this.songId;
	}

	@Override
	public String getTitle() {
		return this.songTitle;
	}

	@Override
	public String getAuthor() {
		return this.songAuthor;
	}

	@Override
	public String getMusicGenre() {
		return this.musicGenre;
	}

	@Override
	public int getLength() {
		return this.length;
	}

}
