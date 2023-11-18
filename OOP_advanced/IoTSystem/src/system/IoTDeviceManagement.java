package system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IoTDeviceManagement <Integer, E> {
	private HashMap<Integer, E> iotDevices;
	
	public IoTDeviceManagement() {
		this.iotDevices = new HashMap<>();
	}
	
	public void addElement(Integer deviceId, E device) {
		this.iotDevices.put(deviceId, device);
	}
}
