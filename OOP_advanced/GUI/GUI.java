package it.unibo.oop.lab.gui1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.*;

public class GUI extends JFrame {
	private int nButton;
	private List<JButton> list;
	private static int firstButtonValue = 0;
	
	public GUI(int size) {
		this.nButton = size;
		this.list = new LinkedList<JButton>();
		this.setSize(500, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout());
	}
	
	public void createButton() {
		for (int i = 0; i < this.nButton; i++) {
			this.list.add(new JButton("0"));
			if (i == this.nButton - 1) {
				this.list.add(new JButton("Print"));
			}
		}
		this.printButton();
	}
	
	private void printButton() {
		for (JButton button : this.list) {
			this.getContentPane().add(button);
		}
		this.setVisible(true);
	}
	
	public void pushButtons() {
		for (JButton buttons : this.list) {
			buttons.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (buttons.getText() != "Print") {
						String value = buttons.getText();
						int value1 = Integer.parseInt(value);
						value1 += 1;
						if (value1 <= nButton)
							buttons.setText("" + value1);
						else {
							buttons.setEnabled(false);
						}
					}
					else {
						for (int index = 0; index <= list.size() - 1; index++) {
							if (index == 0) {
								System.out.print("<<" + list.get(index).getText());
							} else if (index < list.size() - 1){
								System.out.print("|" + list.get(index).getText());
							} else if (index == list.size() - 1){
								System.out.print(list.get(index).getText() + ">>");
							}
						}
					}
					
				}
			});
		}
	}
}

