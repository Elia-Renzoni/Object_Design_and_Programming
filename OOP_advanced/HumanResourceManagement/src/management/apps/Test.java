package management.apps;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Manager mn = new Manager("Tobia", "Marchionni");
		mn.addHardSkill("Managemnt");
		mn.addHardSkill("Fault Tollerance");
		SoftwareDeveloper sd = new SoftwareDeveloper("Elia", "Renzoni");
		sd.addHardSkill("Distribuited System");
		DataScientist dst = new DataScientist("Sara", "Mattioli");
		dst.addHardSkill("Python");
		EmbedeedSoftwareEngineer ese = new EmbedeedSoftwareEngineer("Lucia", "Serafini");
		dst.addHardSkill("Real Time Operative System");
		
		ArrayList<String> skills = new ArrayList<>();
		skills.add("Python");
		skills.add("Distribuited System");
		skills.add("Management");
		skills.add("Amazon Web Services");
		
		Project<Employee> p = new Project<>();
		p.addTeamWorker(mn);
		p.addTeamWorker(ese);
		p.addTeamWorker(sd);
		p.addTeamWorker(dst);
		
		p.setSkillsInvolved(skills);
		
		try {
			p.checkResponsability(ese);
			p.checkSkills(ese);
		} catch (IllegalEmployeeExpertiseException ex) {
			System.out.println(ex);
		} catch (IllegalEmployeeResposabilityException ex) {
			System.out.println(ex);
		}
		
	}
}
