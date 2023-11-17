package system;

import java.util.HashMap;

public class IoTDeviceManagement <E> {
	private HashMap<Integer, E> iotDevices;
	
	public IoTDeviceManagement() {
		this.iotDevices = new HashMap<>();
	}
	
	// TODO add values
	// TODO notify all sensor if some sensor make important changes
}
