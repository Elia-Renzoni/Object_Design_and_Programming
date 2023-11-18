package system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IoTDeviceManagement <Integer, E> {
	private HashMap<Integer, E> iotDevices;
	private Iterator<Map.Entry<Integer, E>> iterator;
	
	public IoTDeviceManagement() {
		this.iotDevices = new HashMap<>();
		this.iterator = this.iotDevices.entrySet().iterator();
	}
	
	public void addElement(Integer deviceId, E device) {
		this.iotDevices.put(deviceId, device);
	}
	// TODO notify all sensor if some sensor make important changes
	public void notifyDevices() {
		while (this.iterator.hasNext()) {
			Map.Entry<Integer, E> value = this.iterator.next();
			E device = value.getValue();
			if (device instanceof HumiditySensor) {
				if(((HumiditySensor)device).isWarnable()) {
					if (((TemperatureSensor)device).isWarnable())  {
						System.out.println("Attenzione Regolare la Temperatura");
					}
				} 
			} else if (device instanceof GasDetector) {
				if(((GasDetector)device).isWarnable()) {
					if (((TemperatureSensor)device).isWarnable())  {
						System.out.println("Attenzione Regolare la Temperatura, GAS ALTO");
					}
				} 
			}
		}
	}
}
