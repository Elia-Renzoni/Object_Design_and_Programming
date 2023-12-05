package monitoring.observers;

import javax.swing.JFrame;

public class EffectiveGUI {
	public static void main(String[] args) {
		final TrafficGUI t = new TrafficGUI();
		final JFrame frame = new JFrame();
		frame.getContentPane().add(t.getLabel());
	}
}
