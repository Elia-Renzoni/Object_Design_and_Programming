package datacenter.resources;
import java.util.Comparator;
import java.util.Random;

public class VirtualMachine {
	private int vmID;
	private VirtualMachinesTypes type;
	private int cpuReq;
	private int memReq;
	private int storageReq;
	private Random rnd = new Random();
	
	public VirtualMachine(final VirtualMachinesTypes type, final int cpu, final int mem) {
		this.vmID = this.rnd.nextInt();
		this.type = type;
		this.cpuReq = cpu;
		this.memReq = mem;
		this.storageReq = type.getMaxStorage();
	}
	
	// getters
	public int getVMId() {
		return this.vmID;
	}
	
	public VirtualMachinesTypes getType() {
		return this.type;
	}
	
	public int getCpuReq() {
		return this.cpuReq;
	}
	
	public int getMemReq() {
		return this.memReq;
	}
	
	public int getStorageReq() {
		return this.storageReq;
	}
	
	public static class JustCompare implements Comparator<VirtualMachine> {

		@Override
		public int compare(VirtualMachine o1, VirtualMachine o2) {
			return o1.getVMId() - o2.getVMId();
		}
		
	}
}
