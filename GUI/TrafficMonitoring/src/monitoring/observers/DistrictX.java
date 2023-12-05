package monitoring.observers;

import javax.swing.JLabel;

import monitoring.TrafficUpdate;
import monitoring.interfaces.TrafficObserver;

public class DistrictX implements TrafficObserver {

	private TrafficGUI t = new TrafficGUI();
	@Override
	public void notify(TrafficUpdate event) {
		JLabel l = t.getLabel();
		l.setText(event.getCityArea());
	}

}
