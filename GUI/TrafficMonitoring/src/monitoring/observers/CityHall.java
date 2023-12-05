package monitoring.observers;

import monitoring.TrafficUpdate;
import monitoring.interfaces.TrafficObserver;

import javax.swing.JLabel;

public class CityHall implements TrafficObserver {

	private TrafficGUI t = new TrafficGUI();
	@Override
	public void notify(TrafficUpdate event) {
		JLabel l = t.getLabel();
		l.setText(event.getCityArea());
	}

}
