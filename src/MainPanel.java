import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	public MainPanel() {
		super(new GridLayout());
		BorderLayout main = new BorderLayout();
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		
		this.setBackground(java.awt.Color.white);
		this.setPreferredSize(new java.awt.Dimension(500, 1000));
		this.setSize(new java.awt.Dimension(500, 1000));
		ButtonGroup bg = new ButtonGroup();
		
		// add panel on top
		// set size of buttons

		this.add(new Buttons("50 Min", bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		this.add(new Buttons("75 Min (1 hr. 15 min.)", bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		this.add(new Buttons("110 Min (1 hr. 50 min.)", bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		this.add(new Buttons("120 Min (2 hrs.)", bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		this.add(new Buttons("180 Min (3 hrs.)", bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
	}
}
