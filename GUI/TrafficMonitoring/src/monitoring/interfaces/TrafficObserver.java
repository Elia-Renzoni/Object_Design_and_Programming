package monitoring.interfaces;
import monitoring.TrafficUpdate;

public interface TrafficObserver {
	void notify(TrafficUpdate event);
}
