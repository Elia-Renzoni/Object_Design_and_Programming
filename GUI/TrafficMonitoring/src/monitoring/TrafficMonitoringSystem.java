package monitoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import monitoring.interfaces.TrafficObserver;
import monitoring.observers.*;

public class TrafficMonitoringSystem {
	private List<TrafficObserver> observers;
	
	public TrafficMonitoringSystem() {
		this.observers = new ArrayList<>();
	}
	
	public void attachObserver(TrafficObserver ob) {
		this.observers.add(ob);
	}
	
	public void notifyAll(TrafficUpdate e) {
		for (TrafficObserver value : this.observers) {
			switch (e.getCityArea()) {
			case "Square":
				((Square)value).notify(e);
				break;
			case "CityHall":
				((CityHall)value).notify(e);
				break;
			case "DistrictX":
				((DistrictX)value).notify(e);
				break;
			}
		}
	}
}
