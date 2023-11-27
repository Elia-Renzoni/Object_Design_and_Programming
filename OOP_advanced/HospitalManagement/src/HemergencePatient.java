
public class HemergencePatient extends Patient {
	public HemergencePatient(String patientName, String patientSurname, int patientAge, int patientIdCode) {
		super(patientName, patientSurname, patientAge, patientIdCode);
	}
	
	public byte handleException() {
		try {
			super.isIdCodeOk();
			super.isPatientAgeOk();
		} catch (IllegalPatientAgeException ex) {
			System.out.println("Eta' illegale, Inserire una nuova etá");
			return 0;
		} catch (IllegalPatientIdCodeException ex) {
			System.out.println("Codice id illegale, inserire un nuovo id");
			return -1;
		}
		return 1;
	}
}
