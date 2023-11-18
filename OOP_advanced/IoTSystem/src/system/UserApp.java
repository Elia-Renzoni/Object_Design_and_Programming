package system;

public class UserApp {
	public static void main(String[] args) {
		HumiditySensor mySensor = new HumiditySensor();
		GasDetector myGasDet = new GasDetector();
		TemperatureSensor tempSens = new TemperatureSensor();
		
		if (!mySensor.increaseActualValue(12)) {
			mySensor.addValue();
		} else {
			System.out.println("Attenzione");
		}
		
		IoTDeviceManagement<Integer, HumiditySensor> man1 = new IoTDeviceManagement<>();
		man1.addElement(23, mySensor);
	}
}
