package system;

import java.util.LinkedList;
import java.util.Queue;

public class HumiditySensor extends IotDevice {
	
	public HumiditySensor() {
		super();
		super.data = new LinkedList<>();
	}

	@Override
	public boolean increaseActualValue(double increment) {
		super.actualValue += increment;
		return super.isWarnable();
	}

	@Override
	public boolean decreaseActualValue(double decrement) {
		super.actualValue -= decrement;
		return super.isWarnable();
	}

	@Override
	public void addValue() {
		super.data.add(super.actualValue);
	}

	@Override
	public void setAlertValue(double alertValue) {
		super.alertValue = alertValue;
	}

	@Override
	public void setNonAlertValue(double nonAlertValue) {
		super.nonAlertValue = nonAlertValue;
	}

	@Override
	public int getDeviceId() {
		return IotDevice.deviceId;
	}

	@Override
	public double getActualValue() {
		return super.actualValue;
	}

	@Override
	public double getAlertValue() {
		return super.alertValue;
	}

	@Override
	public double getNonAlertValue() {
		return super.nonAlertValue;
	}

	@Override
	public void setDeviceId(int id) {
		IotDevice.deviceId = id;
	}
}
