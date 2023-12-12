package sport.centre.management;

import java.util.LinkedList;
import java.util.List;

import detecteer.NullGeneralityException;

public class SportsComplex {
	private List<Pair<Instructor, Athlete>> complex;
	
	public SportsComplex() {
		this.complex = new LinkedList<>();
	}
	
	public void addNewAssociation(Instructor ins, Athlete at) {
		this.complex.add(new Pair(ins, at));
		try {
			System.out.println("The Instructor : " + ins.getName() + " " + ins.getSurname() + " With id " + ins.getId());
			System.out.println("Has the Athelete : " + at.getName() + " " + at.getSurname() + " With id " + at.getId());
		} catch (NullGeneralityException e) {
			System.out.println(e);
		}
	}
	
	public List<?> getComplex() {
		return this.complex;
	}
}
