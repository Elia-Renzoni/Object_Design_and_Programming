package datacenter.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DataCenter {
	private List<VirtualMachine> machineBatt;
	private List<VirtualMachine> currenltyUse;
	private List<VirtualMachine> bookingList;
	
	public DataCenter() {
		this.machineBatt = new LinkedList<>();
		this.currenltyUse = new LinkedList<>();
		this.bookingList = new LinkedList<>();
	}
	
	public void addVirtualMachine(VirtualMachine vm) {
		this.machineBatt.add(vm);
	}
	
	public void checkCompatibilty() throws ResourseAllocationFaultException {
		for (VirtualMachine machine : this.machineBatt) {
			if (machine.getCpuReq() < DataCenterResource.MAX_CPU.getResources() / this.machineBatt.size()
				&& machine.getMemReq() < DataCenterResource.MAX_MEM.getResources() / this.machineBatt.size() 
				&& machine.getStorageReq() < DataCenterResource.MAX_STORAGE.getResources() / this.machineBatt.size()) {
				
				this.currenltyUse.add(machine);
				System.out.println("Macchina in USO !");
			} else {
				throw new ResourseAllocationFaultException("Something wrong !");
			}
		}
	}
	
	public void bookingResources(VirtualMachine vm) throws BookingFaultException, ResourseAllocationFaultException {
		int index = Collections.binarySearch(this.currenltyUse, vm, new VirtualMachine.JustCompare());
		
		if (this.currenltyUse.size() < this.machineBatt.size() && index != -1) {
			if (vm.getCpuReq() < DataCenterResource.MAX_CPU.getResources() / this.machineBatt.size()
				&& vm.getMemReq() < DataCenterResource.MAX_MEM.getResources() / this.machineBatt.size()
				&& vm.getStorageReq() < DataCenterResource.MAX_STORAGE.getResources() / this.machineBatt.size()) {
				
				this.bookingList.add(vm);
			} else {
				throw new ResourseAllocationFaultException("Something wrong !");
			}
		} else {
			throw new BookingFaultException("No Booking !");
		}
	}
	
	private enum DataCenterResource {
		MAX_CPU(50),
		MAX_MEM(40000),
		MAX_STORAGE(60000);
		
		private int metric;
		
		private DataCenterResource(final int resources) {
			this.metric = resources;
		}
		
		private int getResources() {
			return this.metric;
		}
	}
}
