package postal.packages;

public class SpecialPackage extends Package {
	private boolean isSpecial;
	
	public SpecialPackage(int packageId, double height, double weight, String destination, String owner, String deliveryTime) {
		super(packageId, height, weight, destination, owner, deliveryTime);
	}
	
	public void setLabelifSpecial() {
		this.isSpecial = true;
	}
	
	public boolean getSpecial() {
		return this.isSpecial;
	}

}
