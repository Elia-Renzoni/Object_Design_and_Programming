package nature.serve.classes;

import java.util.LinkedList;
import java.util.List;

public class Reserve <U extends Organism> {
	private List<U> reserve;
	
	public Reserve() {
		this.reserve = new LinkedList<>();
	}
	
	public void addOrganims(U organism) {
		this.reserve.add(organism);
		System.out.println("Add new Element");
	}
}
