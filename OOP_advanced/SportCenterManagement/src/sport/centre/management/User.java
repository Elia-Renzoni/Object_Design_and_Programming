package sport.centre.management;

import detecteer.NullGeneralityException;

public class User {
	public static void main(String[] args) {
		Athlete at = new Athlete("Dan", "Ige");
		Athlete at1 = new Athlete("Marvin", "Vettori");
		Athlete at2 = new Athlete("Demetrius", "Jhonson");
		Athlete at3 = new Athlete("Bryce", "Mitchell");
		
		try {
			at.addSport(at.new Sport("MMA"));
			at.addSport(at.new Sport("Grappling"));
			
			at1.addSport(at1.new Sport("Freestyle Wrestling"));
			at1.addSport(at1.new Sport("Boxe"));
			
			at2.addSport(at2.new Sport("MMA"));
			at2.addSport(at2.new Sport("Vale Tudo"));
			
			at3.addSport(at3.new Sport("Muay Thai"));
			at3.addSport(at3.new Sport("BJJ"));
		} catch (NullGeneralityException e) {
			System.out.println(e);
		}
		
		Instructor ins = new Instructor("Henry", "Cejudo");
		ins.addAthlete(at1);
		Instructor ins1 = new Instructor("Erik", "Nicksik");
		ins1.addAthlete(at);
		ins1.addAthlete(at2);
		ins1.addAthlete(at3);
		
		SportsComplex sport = new SportsComplex();
		sport.addNewAssociation(ins, at1);
		sport.addNewAssociation(ins1, at);
		sport.addNewAssociation(ins1, at3);
		sport.addNewAssociation(ins1, at2);
	}
}
