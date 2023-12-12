package sport.centre.management;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import detecteer.NullGeneralityException;
import sport.centre.management.interfaces.Generality;

public class Instructor implements Generality {
	private List<Athlete> athletes;
	private String name;
	private String surname;
	private int instructorId;
	private Random rdn;
	
	public Instructor(String name, String surname) {
		this.athletes = new LinkedList<>();
		this.name = name;
		this.surname = surname;
		this.rdn = new Random();
		this.instructorId = rdn.nextInt();
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
		if (this.instructorId >= 0)
			return this.instructorId;
		else 
			throw new NullGeneralityException();
	}
	
	public void addAthlete(Athlete athlete) {
		this.athletes.add(athlete);
	}
	
	public List<Athlete> getAthletes() {
		return this.athletes;
	}
}
