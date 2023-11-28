package management.apps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Project <E extends Manager> {
	private HashMap<String, String> team;
	private List<String> hardSkillsInvolved;
	
	public Project() {
		this.team = new HashMap<>();
		this.hardSkillsInvolved = new ArrayList<>();
	}
	
	public void addTeamWorker(E teamWorker) {
		this.team.put(teamWorker.getResponsability(), teamWorker.getEmployee());
	}
	
	public void setSkillsInvolved(List<String> skills) {
		this.hardSkillsInvolved = skills;
	}
	
	public void checkSkills(E employee) throws IllegalEmployeeExpertiseException {
		for (var skills : this.hardSkillsInvolved) {
			for (var employeeSkills : employee.getExpertise()) {
				if (skills != employeeSkills)
					throw new IllegalEmployeeExpertiseException();
			}
		}
	}
	
	public void checkResponsability(E employee) throws IllegalEmployeeResposabilityException {
		for (Map.Entry<String, String> set : this.team.entrySet()) {
			if (!(employee.getResponsability().equals(set.getKey()))) {
				throw new IllegalEmployeeResposabilityException();
			}
		}
	}
}
