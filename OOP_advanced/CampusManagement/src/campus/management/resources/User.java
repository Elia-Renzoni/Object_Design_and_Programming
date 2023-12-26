package campus.management.resources;

public class User {
	public static void main(String ...args) {
		Student std1 = new Student("Elia", "Renzoni", 34440);
		Student std2 = new Student("Sara", "Pieretti", 7890);
		Student std3 = new Student("Micol", "Di Segni", 88890);
		Student std4 = new Student("Mara", "Borello", 9929);
		Student std5 = new Student("Alexa", "Grasso", 34902);
		
		Class cl1 = new Class("Informatica", "Tim Elliot", 130);
		Class cl2 = new Class("Biotecnologie", "Bryce Mitchell", 150);
		
		
		std1.addCourseToFollow(cl2);
		std2.addCourseToFollow(cl1);
		std3.addCourseToFollow(cl1);
		std4.addCourseToFollow(cl1);
		std5.addCourseToFollow(cl2);
		
		try {
			std1.calculteCFUSum();
			std2.calculteCFUSum();
			std3.calculteCFUSum();
			std4.calculteCFUSum();
			std5.calculteCFUSum();
		} catch (InsufficientCFUException e) {
			e.printStackTrace();
		}
		
		cl1.addStudent(std2);
		cl1.addStudent(std3);
		cl1.addStudent(std4);
		cl2.addStudent(std5);
		cl2.addStudent(std1);
		
		University uni = new University();
		
		uni.addStudentToUniversity(std1);
		uni.addStudentToUniversity(std2);
		uni.addStudentToUniversity(std3);
		uni.addStudentToUniversity(std4);
		uni.addStudentToUniversity(std5);
		
		uni.addActiveClasses(cl2);
		uni.addActiveClasses(cl1);
	}
} 
