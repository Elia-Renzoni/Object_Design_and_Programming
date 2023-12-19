package datacenter.resources;

import java.util.Random;

public class User {
	public static void main(String ...args) {
		VirtualMachine machines[] = new VirtualMachine[10];
		Random rnd = new Random();
		
		for (int i = 0; i < machines.length; i++) {
			machines[i] = new VirtualMachine(rnd.nextInt() < 5? VirtualMachinesTypes.SMALL : VirtualMachinesTypes.MEDIUM , rnd.nextInt(), rnd.nextInt());
		}
		
		DataCenter dt = new DataCenter();
		for (int i = 0; i < machines.length; i++) {
			dt.addVirtualMachine(machines[i]);
		}
		
		try {
			dt.checkCompatibilty();
		} catch (ResourseAllocationFaultException e) {
			System.out.println(e);
		}
		
		for (int i = 0; i < machines.length; i++) {
			try {
				dt.bookingResources(machines[i]);
			} catch (BookingFaultException | ResourseAllocationFaultException e) {
				System.out.println(e);
			}
		}
	}
}
