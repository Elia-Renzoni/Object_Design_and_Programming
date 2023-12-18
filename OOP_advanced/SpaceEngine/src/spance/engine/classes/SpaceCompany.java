package spance.engine.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpaceCompany<E extends SpaceCraft> {
	private List<E> navy;
	
	public SpaceCompany() {
		this.navy = new ArrayList<>();
	}
	
	public void addVehicle(E vehicle) {
		this.navy.add(vehicle);
	}
	
	public void printInformations() {
		Iterator<?> myIt = this.navy.iterator();
		while (myIt.hasNext()) {
			@SuppressWarnings("unchecked")
			E vehicle = (E)myIt.next();
			System.out.println("Name : " + vehicle.getName() + " Speed : " + vehicle.getMaxSpeed() + " Weight : " + vehicle.getMaxWeight());
		}
	}
}
