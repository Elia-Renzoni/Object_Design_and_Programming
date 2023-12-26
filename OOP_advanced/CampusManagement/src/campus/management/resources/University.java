package campus.management.resources;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class University {
	private List<Optional<String>> classes;
	private List<Classes> totalCourses;
	private List<String> students;
	
	public University() {
		this.classes = new LinkedList<>();
		this.students = new LinkedList<>();
		this.totalCourses = List.of(Classes.INFORMATICA, Classes.BIOTECNOLOGIE, Classes.GIURISPRUDENZA, Classes.INGEGNERIA_ELETTRONICA, Classes.LINGUE_STRANIERE);
	}
	
	public void addActiveClasses(Class myClass) {
		final boolean result = this.totalCourses.stream()
				.anyMatch(course -> course.getClassName().equals(myClass.getClassName()));
		
		if (result) {
			this.classes.add(Optional.of(myClass.getClassName()));
		} else {
			this.classes.add(Optional.empty());
		}
	}
	
	public void addStudentToUniversity(Student student) {
		this.students.add(student.getName() + " " + student.getSurname());
	}
	
	private enum Classes {
		INFORMATICA("Informatica"),
		BIOTECNOLOGIE("Biotecnologie"),
		LINGUE_STRANIERE("Lingue Straniere"),
		GIURISPRUDENZA("Giurisprudenza"),
		INGEGNERIA_ELETTRONICA("Ingegneria Elettronica");
		
		private String className;
		
		private Classes(String className) {
			this.className = className;
		}
		
		public String getClassName() {
			return this.className;
		}
	}
}
