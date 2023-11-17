package system;

//import java.util.List;
import java.util.Queue;

public abstract class IotDevice {
	protected static int deviceId;
	protected double alertValue;
	protected double nonAlertValue;
	protected Queue<Double> data;
	protected boolean warning;
	protected double actualValue;
	
	abstract public boolean increaseActualValue(double increment);
	abstract public boolean decreaseActualValue(double decrement);
	abstract public void addValue();
	abstract public void setAlertValue(double alertValue);
	abstract public void setNonAlertValue(double nonAlertValue);
	protected boolean isWarnable() {
		if (this.actualValue >= this.alertValue) 
			return true;
		else
			return false;
	}
	abstract public int getDeviceId();
	abstract public double getActualValue();
	abstract public double getAlertValue();
	abstract public double getNonAlertValue();
	abstract public void setDeviceId(int id);
	
}
