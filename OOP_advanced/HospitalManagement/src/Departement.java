import java.util.LinkedList;
import java.util.List;

public class Departement <U extends Patient> {
	private List<U> ordinaryDepartementDB;
	private List<U> hemercencyDepartementDB;
	private static final String ORDINARY_DEPARTEMENT = "ORDINARY DEPARTEMENT";
	private static final String HEMERCENCY_DEPARTEMENT = "HEMERCENCY DEPARTEMENT";
	
	public Departement() {
		this.ordinaryDepartementDB = new LinkedList<>();
		this.hemercencyDepartementDB = new LinkedList<>();
	}
	
	public void addPatient(U myPatient) {
		if (myPatient instanceof OrdinaryPatient) {
			myPatient.setAssignedDepartement(ORDINARY_DEPARTEMENT);
			this.ordinaryDepartementDB.add(myPatient);
		} else {
			myPatient.setAssignedDepartement(HEMERCENCY_DEPARTEMENT);
			this.hemercencyDepartementDB.add(myPatient);
		}
	}
	
	public void removePatient(int id) {
		for (var patient : this.ordinaryDepartementDB) {
			if (patient.getPatientIdCode() == id) {
				this.ordinaryDepartementDB.remove(patient);
				break;
			}
		}
		for (var patient : this.hemercencyDepartementDB) {
			if (patient.getPatientIdCode() == id) {
				this.hemercencyDepartementDB.remove(patient);
				break;
			}
		}
	}
	
	public void printAllPatient() {
		System.out.println("Ordinary Departement");
		this.printDep(ordinaryDepartementDB);
		System.out.println("Hemercency Departement");
		this.printDep(hemercencyDepartementDB);
	}
	
	private void printDep(List<?> database) {
		for (var patient : database) {
			System.out.println(((Patient)patient).genPatient());
		}
	}
}
