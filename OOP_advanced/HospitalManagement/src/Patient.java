
public abstract class Patient {
	private final String patientName;
	private final String patientSurname;
	private int patientAge;
	private int patientIdCode;
	private String assignedDepartement;

	public Patient(String patientName, String patientSurname, int patientAge, int patientIdCode) {
		this.patientName = patientName;
		this.patientSurname = patientSurname;
		this.patientAge = patientAge;
		this.patientIdCode = patientIdCode;
		this.assignedDepartement = null;
	}
	
	public void isIdCodeOk() throws IllegalPatientIdCodeException {
		if (this.patientIdCode < 0 || this.patientIdCode > Integer.MAX_VALUE) {
			throw new IllegalPatientIdCodeException("ID troppo piccolo o troppo grande");
		}
	}
	
	public void isPatientAgeOk() throws IllegalPatientAgeException {
		if (this.patientAge < 0 || this.patientAge > 150) {
			throw new IllegalPatientAgeException("Etá troppo piccola o troppo grande");
		}
	}
	
	public String genPatient() {
		return this.patientName + "\t" + this.patientSurname;
	}
	public int getPatientAge() {
		return this.patientAge;
	}
	
	public int getPatientIdCode() {
		return this.patientIdCode;
	}
	
	public void setPatientAge(int newAge) {
		this.patientAge = newAge;
	}
	
	public void setPatientIdCode(int newCode) {
		this.patientIdCode = newCode;
	}
	
	public void setAssignedDepartement(String myDep) {
		this.assignedDepartement = myDep;
	}
}
