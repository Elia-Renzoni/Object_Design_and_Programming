package spance.engine.classes;

public class User {
	public static void main(String ...args) {
		SpaceCompany<SpaceCraft> myCompany = new SpaceCompany<>();
		
		SpaceCargo cargo1 = new SpaceCargo();
		cargo1.setName("xx11");
		cargo1.setMaxSpeed(300);
		cargo1.setMaxWeight(500);
		
		SpaceShuttle shuttle1 = new SpaceShuttle();
		shuttle1.setName("sx23");
		shuttle1.setMaxWeight(0);
		shuttle1.setMaxSpeed(40);
		
		myCompany.addVehicle(shuttle1);
		myCompany.addVehicle(cargo1);
		
		myCompany.printInformations();
	}
}
