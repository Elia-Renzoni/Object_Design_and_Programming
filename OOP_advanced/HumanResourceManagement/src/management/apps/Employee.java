package management.apps;

import java.util.LinkedList;
import java.util.List;

public abstract class Employee {
	private String name;
	private String surname;
	private List<String> technicalExpertise;
	private List<String> softSkills;
	
	public Employee(String name, String surname) {
		this.name = name;
		this.surname = surname;
		this.technicalExpertise = new LinkedList<>();
		this.softSkills = new LinkedList<>();
	}
	
	public void addHardSkill(String newSkill) {
		this.technicalExpertise.add(newSkill);
	}
	
	public void addSoftSkill(String newSkill) {
		this.softSkills.add(newSkill);
	}
	
	public void removeHardSkill(String skillToRemove) {
		for (var skill : this.technicalExpertise) {
			if (skill == skillToRemove) {
				this.technicalExpertise.remove(skill);
				break;
			}
		}
	}
	
	public void removeSoftSkill(String softSkillToRemove) {
		for (var skill : this.softSkills) {
			if (skill == softSkillToRemove) {
				this.technicalExpertise.remove(skill);
				break;
			}
		}
	}
	
	public String getEmployee() {
		return this.name + this.surname;
	}
	
	public List<?> getExpertise() {
		return this.technicalExpertise;
	}
	
	public List<?> getSoftSkills() {
		return this.softSkills;
	}
	
}
