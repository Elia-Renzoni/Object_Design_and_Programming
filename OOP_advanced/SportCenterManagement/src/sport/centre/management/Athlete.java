package sport.centre.management;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import detecteer.NullGeneralityException;
import sport.centre.management.interfaces.Generality;

public class Athlete implements Generality {
	private List<Sport> sports;
	private String name;
	private String surname;
	private int atId;
	private Random rdn;
	
	public Athlete(String name, String surname) {
		this.sports = new LinkedList<>();
		this.rdn = new Random();
		this.name = name;
		this.surname = surname;
		this.atId = rdn.nextInt();
	}
	
	@Override
	public String getName() throws NullGeneralityException {
		if (this.name != null)
			return this.name;
		else 
			throw new NullGeneralityException();
	}

	@Override
	public String getSurname() throws NullGeneralityException {
		if (this.surname != null)
			return this.surname;
		else
			throw new NullGeneralityException();
	}

	@Override
	public int getId() throws NullGeneralityException {
		if (this.atId >= 0)
			return this.atId;
		else 
			throw new NullGeneralityException();
	}

	public void addSport(Sport sport) throws NullGeneralityException {
		if (sport.getSportName() != null) 
			this.sports.add(sport);
		else 
			throw new NullGeneralityException();
	}
	
	// nested
	public class Sport {
		private String typeOfSport;
		
		public Sport(String typeOfSport) {
			this.typeOfSport = typeOfSport;
		}
		
		public String getSportName() {
			return this.typeOfSport;
		}
	}

}
