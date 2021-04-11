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

		
		this.setBackground(java.awt.Color.white);
		this.setPreferredSize(new java.awt.Dimension(500, 1000));
		this.setSize(new java.awt.Dimension(500, 1000));
		ButtonGroup bg = new ButtonGroup();
		

		JButton btn1 = new JButton("50 Min");
		JButton btn2 = new JButton("75 Min (1 hr. 15 min.");
		JButton btn3 = new JButton("110 Min (1 hr. 50 min.)");
		JButton btn4 = new JButton("120 Min (2 hrs.)");
		JButton btn5 = new JButton("180 Min (3 hrs.)");

		
		

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		bg.add(btn5);

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);

		
	}
}
