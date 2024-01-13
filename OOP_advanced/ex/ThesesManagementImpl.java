package appello2.ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThesesManagementImpl implements ThesesManagement {
	private Map<Integer, String> students;
	private List<Theses> theses;
	
	public ThesesManagementImpl() {
		this.students = new HashMap<>();
		this.theses = new ArrayList<>();
	}
	
	@Override
	public void registerStudent(int studentId, String name) {
		if (this.checkStudentId(studentId))
			throw new IllegalArgumentException();
		else 
			this.students.put(studentId, name);
	}

	@Override
	public void registerThesis(int thesisId, String title, int studentId) {
		if (this.checkThesesId(thesisId) || this.checkStudentIdInTheses(studentId)) {
			throw new IllegalArgumentException();
		} else {
			this.theses.add(this.new Theses(null, 0, thesisId, studentId, title));
		}
	}

	@Override
	public void thesisApproved(int thesisId) {
		if (!(this.isThesisApproved(thesisId)))
			for (var theses : this.theses) {
				if (theses.getThesesId() == thesisId)
					theses.setStatus(Status.APPROVED);
			}
		else 
			throw new IllegalArgumentException();
	}

	@Override
	public void thesisSubmitted(int thesisId, String finalTitle) {
		if (!(this.isThesisSubmitted(thesisId)))
			for (var theses : this.theses) {
				if (theses.getThesesId() == thesisId) {
					theses.setStatus(Status.SUBMITTED);
					theses.setTitle(finalTitle);
				}
			}
		else 
			throw new IllegalArgumentException();
	}

	@Override
	public void thesisConcluded(int thesisId, int score) {
		if (!(this.isThesisConcluded(thesisId)))
			for (var theses : this.theses) {
				if (theses.getThesesId() == thesisId) {
					theses.setStatus(Status.CONCLUDED);
					theses.setFinalScore(score);
				}
			}
		else 
			throw new IllegalArgumentException();
	}

	@Override
	public Pair<String, Status> thesis(int thesisId) {
		for (var theses : this.theses) {
			if (theses.getThesesId() == thesisId) {
				return new Pair<>(theses.getThesesTitle(), theses.getStatus());
			}
		}
		return new Pair<>(null, null);
	}

	@Override
	public Map<String, Status> statusByStudent() {
		final Map<String, Status> combo = new HashMap<>();
		
		for (var student : this.students.entrySet()) {
			for (var theses : this.theses) {
				if (student.getKey() == theses.getStudentId()) {
					combo.put(student.getValue(), theses.getStatus());
				}
			}
		}
		return combo;
	}

	@Override
	public double averageThesisScore() {
		final long conclused = this.theses.stream()
				.filter(n -> n.getStatus() == Status.CONCLUDED)
				.count();
		final int sum = this.theses.stream()
				.filter(n -> n.getStatus() == Status.CONCLUDED)
				.mapToInt(n -> n.getScore())
				.sum();
		
		return sum / conclused;
	}
	
	
	
	private boolean isThesisApproved(final int thesisId) {
		return this.theses.stream()
				.filter(n -> n.getThesesId() == thesisId)
				.anyMatch(n -> n.getStatus() == Status.APPROVED);
	}
	
	private boolean isThesisSubmitted(final int thesisId) {
		return this.theses.stream()
				.filter(n -> n.getThesesId() == thesisId)
				.anyMatch(n -> n.getStatus() == Status.SUBMITTED);
	}
	
	private boolean isThesisConcluded(final int thesisId) {
		return this.theses.stream()
				.filter(n -> n.getThesesId() == thesisId)
				.anyMatch(n -> n.getStatus() == Status.CONCLUDED);
	}
	
	private boolean checkThesesId(final int thesisId) {
		return this.theses.stream()
				.anyMatch(n -> n.getThesesId() == thesisId);
	}
	
	private boolean checkStudentIdInTheses(final int studentId) {
		return this.theses.stream()
				.anyMatch(n -> n.getStudentId() == studentId);
	}
	
	private boolean checkStudentId(final int studentId) {
		return this.students.entrySet().stream()
				.map(Map.Entry::getKey)
				.anyMatch(n -> n == studentId);
	}
	// --------------------------------------------------------------------- //
	/**
	 * Nested Class
	 * */
	private class Theses {
		private Status status;
		private int score;
		private int thesesId;
		private int studentId;
		private String thesesTitle;
		
		private Theses(final Status status, final int score, final int thesesId, final int studentId, final String thesesTitle) {
			this.status = status;
			this.score = score;
			this.thesesId = thesesId;
			this.studentId = studentId;
			this.thesesTitle = thesesTitle;
		}
		
		public void setStatus(final Status newStatus) {
			this.status = newStatus;
		}
		
		public void setTitle(final String newTitle) {
			this.thesesTitle = newTitle;
		}
		
		public void setFinalScore(final int score) {
			this.score = score;
		}
		
		public Status getStatus() {
			return this.status;
		}
		
		public int getScore() {
			return this.score;
		}
		
		public int getThesesId() {
			return this.thesesId;
		}
		
		public int getStudentId() {
			return this.studentId;
		}
		
		public String getThesesTitle() {
			return this.thesesTitle;
		}
	}
}
