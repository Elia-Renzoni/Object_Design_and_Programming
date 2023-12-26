package campus.management.resources;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Student {
	private final String name;
	private final String surname;
	private int serialNumber;
	private HashMap<Integer, Pair<String, Integer>> enrolledCourses; 
	private int CFUsum;

	public Student(final String name, final String surname, final int serialNumber) {
		this.name = name;
		this.surname = surname;
		this.serialNumber = serialNumber;
		this.enrolledCourses = new HashMap<>();
	}
	
	public void addCourseToFollow(final Class myClass) {
		this.enrolledCourses.put(myClass.hashCode(), new Pair(myClass.getClassName(), myClass.getCFU()));
		System.out.println(myClass.toString());
	}
	
	public void calculteCFUSum() throws InsufficientCFUException {
		this.CFUsum = this.enrolledCourses.entrySet().stream()
				.mapToInt(entry -> entry.getValue().getCFU())
				.sum();
		
		if (this.CFUsum < 50)
			throw new InsufficientCFUException();
		else {
			System.out.println("CFU giusti !");
		}
	}
		
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getSerialNumber() {
		return this.serialNumber;
	}
	
	public int totalCFU() {
		return this.CFUsum;
	}
}
