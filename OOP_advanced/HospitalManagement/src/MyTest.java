
public class MyTest {
	public static void main(String[] args) {
		HemergencePatient h = new HemergencePatient("Matteo", "Rossi", 0, 87);
		HemergencePatient h1 = new HemergencePatient("Giovanni", "Bianchi", 45, 99558);
		HemergencePatient h2 = new HemergencePatient("Giuseppe", "Branbilla", 20, 87731);
		HemergencePatient h3 = new HemergencePatient("Fausto", "Alessandrini", 34, 98);
			
		OrdinaryPatient o = new OrdinaryPatient("Elia", "Renzoni", 20, 340);
		OrdinaryPatient o1 = new OrdinaryPatient("Sara", "Andreoletti", 55, 33);
		
		o.handleException();
		o1.handleException();
		
		Departement<Patient> dp = new Departement<>();
		dp.addPatient(h3);
		dp.addPatient(h);
		dp.addPatient(h2);
		dp.addPatient(h1);
		dp.addPatient(o1);
		dp.addPatient(o);
		
		dp.printAllPatient();
	}
	
}
