package monitoring.observers;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TrafficGUI {
	private JLabel label;
	
	public void addLabel(JFrame frame) {
		frame.add(this.label = new JLabel("No Event"));
	}
	
	public void modLabel(String text) {
		this.label.setText(text);
	}
	
	public JLabel getLabel() {
		return this.label;
	}
}
