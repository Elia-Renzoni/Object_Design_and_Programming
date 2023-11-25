package postal.packages;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PostalOffice<T> {
	private Stack<Package> packageStack;
	private Stack<SpecialPackage> specialPackageStack;
	
	public PostalOffice() {
		this.packageStack = new Stack<>();
		this.specialPackageStack = new Stack<>();
	}
	
	public void addPackage(T newPackage) throws BrittlePackageException {
		if (newPackage instanceof Package) 
			this.packageStack.add((Package)newPackage);
		else {
			SpecialPackage pck = (SpecialPackage)newPackage;
			if (!(pck.getSpecial()))
				throw new BrittlePackageException("Impossibile aggiungere il pacco speciale");
			else
				this.specialPackageStack.add(pck);
		}
	}
	
	public Stack<Package> getPackageStack() {
		return this.packageStack;
	}
	
	public Stack<SpecialPackage> getSpecialPackageStack() {
		return this.specialPackageStack;
	}
	
	public void printPackages(T value) {
		Iterator<?> it;
		if (value instanceof Package) {
			it = this.packageStack.iterator();
			while (it.hasNext()) {
				Package elem = (Package)it.next();
				System.out.println(elem.getPackageId());
				System.out.println(elem.getPackageOwner());
			}
		} else {
			it = this.specialPackageStack.iterator();
			while (it.hasNext()) {
				SpecialPackage elem = (SpecialPackage)it.next();
				System.out.println(elem.getPackageId());
				System.out.println(elem.getPackageOwner());
				System.out.println(elem.getSpecial());
			}
		}
	}
	
}
