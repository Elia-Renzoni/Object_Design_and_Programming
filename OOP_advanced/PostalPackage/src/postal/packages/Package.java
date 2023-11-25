package postal.packages;

public class Package {
	private int packageId;
	private double packageHeight;
	private double packageWeight;
	private String packageDestination;
	private String packageOwner;
	private String packageDeliveryTime;
	
	public Package(int packageId, double height, double weight, String destination, String owner, String deliveryTime) {
		this.packageId = packageId;
		this.packageHeight = height;
		this.packageWeight = weight;
		this.packageDestination = destination;
		this.packageOwner = owner;
		this.packageDeliveryTime = deliveryTime;
	}
	
	public int getPackageId() {
		return this.packageId;
	}
	
	public double getPackageHeight() {
		return this.packageHeight;
	}
	
	public double getPackageWeight() {
		return this.packageWeight;
	}
	
	public String getPackageDestination() {
		return this.packageDestination;
	}
	
	public String getPackageOwner() {
		return this.packageOwner;
	}
	
	public String getPackageDelivery() {
		return this.packageDeliveryTime;
	}
	
	public void changeDestination(String newDestination) {
		this.packageDestination = newDestination;
	}
}
