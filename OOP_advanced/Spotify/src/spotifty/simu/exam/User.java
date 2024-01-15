package spotifty.simu.exam;

public class User {
	public static void main(String ...args) {
		Song s1 = new Song(1, "Concius Club", "Vulfpeck", "Funk", 12);
		Song s2 = new Song(2, "Fame", "David Bowie", "Rock", 13);
		Song s3 = new Song(3, "Satch Boogie", "Joe Satriani", "Metal", 2);
		Song s4 = new Song(4, "Surfing with Aliens", "Joe Satriani", "Metal", 34);
		Song s5 = new Song(5, "Big Boys Dont cry", "Extreme", "Rock", 12);
		Song s6 = new Song(6, "Riflessi d'Autunno", "Laura Pausini", "Rock", 3);
		Song s7 = new Song(7, "Notturno Incantato", "Laura Pausini", "Pop", 3);
		Song s8 = new Song(8, "Luce Silente", "Giorgia", "Pop", 5);
		Song s9 = new Song(9, "Sussurri Stellati", "Maddalena", "Pop", 8);
		
		Album alb = new Album(11, "Pornograffiti", "Extreme", "Rock");
		alb.addSongToAlbum(s5);
		Album alb1 = new Album(23, "Vulfmon", "Vulfpeck", "Funk");
		alb1.addSongToAlbum(s1);
		
		Playlist pl = new Playlist();
		pl.addElement(alb1);
		pl.addElement(alb);
		pl.addElement(s1);
		pl.addElement(s2);
		pl.addElement(s3);
		pl.addElement(s4);
		pl.addElement(s5);
		pl.addElement(s6);
		pl.addElement(s7);
		pl.addElement(s8);
		pl.addElement(s9);
		
		System.out.println(pl.getElementLength(alb1));
		System.out.println(pl.getElementByAuthor("Joe Satriani"));
		System.out.println(pl.getElementByGenre("Rock"));
	}
}
