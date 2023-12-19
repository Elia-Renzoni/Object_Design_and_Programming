package datacenter.resources;

public enum VirtualMachinesTypes {
	SMALL("SMALL VM", 2300),
	MEDIUM("MEDIUM VM", 5000),
	BIG("BIG VM", 10000);
	
	private final int storageReq;
	private final String info;
	
	private VirtualMachinesTypes(final String infoVM, final int storage) {
		this.storageReq = storage;
		this.info = infoVM;
	}
	
	public int getMaxStorage() {
		return this.storageReq;
	}
	
	public String getVMInformation() {
		return this.info;
	}
	
}
