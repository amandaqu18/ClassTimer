import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
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
		JLabel label1 = new JLabel("50 Min");
		this.add(new Buttons(label1, bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		
		JLabel label2 = new JLabel("75 Min (1 hr. 15 min.)");
		this.add(new Buttons(label2, bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		
		JLabel label3 = new JLabel("110 Min (1 hr. 50 min.)");
		this.add(new Buttons(label3, bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		
		JLabel label4 = new JLabel("120 Min (2 hrs.)");
		this.add(new Buttons(label4, bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
		
		JLabel label5 = new JLabel("180 Min (3 hrs.)");
		this.add(new Buttons(label5, bg, new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		}));
	}
}
