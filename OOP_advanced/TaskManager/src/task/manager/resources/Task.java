package task.manager.resources;

public class Task {
	private final String taskName;
	private final String taskDescription;
	private final int beginningDate;
	
	public Task(final String taskName, final String taskDescritpion, final int date) {
		this.taskName = taskName;
		this.taskDescription = taskDescritpion;
		this.beginningDate = date;
	}
	
	public String getTaskName() {
		return this.taskName;
	}
	
	public String getTaskDescription() {
		return this.taskDescription;
	}
	
	public int getTaskInitDate() {
		return this.beginningDate;
	}
	
	public class DependentTask extends Task {
		private final String dependentTaskName; 
		private final String dependentTaskDescription;
		private final int dependentTaskDate;
		
		public DependentTask(String taskName, String taskDescritpion, int date, final String depTaskName, final String depTaskDescr, final int depTaskDate) {
			super(taskName, taskDescritpion, date);
			this.dependentTaskName = depTaskName;
			this.dependentTaskDescription = depTaskDescr;
			this.dependentTaskDate = depTaskDate;
		}
		
		public void checkIfDatesAreOk() throws IllegalDatesException {
			if (!(this.dependentTaskDate > super.getTaskInitDate())) {
				throw new IllegalDatesException();
			} else {
				System.out.println("Dates ok !");
			}
		}
		
		public String getDependentTaskName() {
			return this.dependentTaskName;
		}
		
		public String getDependentTaskDescription() {
			return this.dependentTaskDescription;
		}
		
		@Override
		public int getTaskInitDate() {
			return this.dependentTaskDate;
		}
	}
}
