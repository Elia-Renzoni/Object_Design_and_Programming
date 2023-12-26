package campus.management.resources;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Class {
	private final String className;
	private int classId;
	private final String teacher;
	private List<Student> studentEnrolled;
	private final int cfu;
	private Random rnd;
	
	public Class(final String className, final String teacherName, final int cfu) {
		this.className = className;
		this.teacher = teacherName;
		this.cfu = cfu;
		this.rnd = new Random();
		this.classId = rnd.nextInt();
		this.studentEnrolled = new LinkedList<>();
	}
	
	
	public void addStudent(Student s) {
		this.studentEnrolled.add(s);
	}
	
	public void removeStudent(String studentName) {
		final boolean result = this.studentEnrolled.stream()
				.anyMatch(student -> student.getName().equals(studentName));
		
		if (result) {
			this.studentEnrolled.remove(studentName);
			System.out.println("Lo studente : " + studentName + " e' stato rimosso dal corso");
		}
	}
	
	public void isReached() throws MaxStudentException {
		final long numberOfStudents = this.studentEnrolled.stream()
						.count();
		if (numberOfStudents > 50) 
			throw new MaxStudentException();
	}
	
	@Override
	public int hashCode() {
		return this.cfu ^ this.classId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		else 
			return false;
	}
	
	public String getTeacher() {
		return this.teacher;
	}
	
	public String getClassName() {
		return this.className;
	}
	
	public int getCFU() {
		return this.cfu;
	}
	
	public int getClassId() {
		return this.classId;
	}
	
	public List<Student> getStudentEnrolled() {
		return this.studentEnrolled;
	}
	
	@Override
	public String toString() {
		return "Class Name : " + this.className + "Teacher : " + this.teacher + "CFU : " + this.cfu;
	}
	
}
