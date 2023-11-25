package postal.packages;

public class Test {
	public static void main(String[] args) {
		Package p = new Package(22, 44.5, 145.6, "Calcinelli", "Elia Renzoni", "12/08/23");
		PostalOffice<Package> pf = new PostalOffice<>();
		try {
			pf.addPackage(p);
		} catch (BrittlePackageException e) {
			System.out.println(e);
		}
		
		pf.printPackages(p);
	}
}
