package sport.centre.management;

public class Pair <Instructor, Athlete>{
	private Instructor instructorGenerality;
	private Athlete athleteGenerality;
	
	public Pair(Instructor ins, Athlete at) {
		this.instructorGenerality = ins;
		this.athleteGenerality = at;
	}
	
	public Instructor getInstructor() {
		return this.instructorGenerality;
	}
	
	public Athlete getAthlete() {
		return this.athleteGenerality;
	}
}
