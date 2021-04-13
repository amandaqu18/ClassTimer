import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class MainPanel extends JPanel {
	private GraphicPanel graphicPanel;
	public MainPanel(GraphicPanel graphicPanel) {
		this.graphicPanel = graphicPanel;
		this.setBackground(java.awt.Color.red);
//		this.setPreferredSize(new java.awt.Dimension(500, 1000));
//		this.setSize(new java.awt.Dimension(500, 1000));
		
		ButtonGroup bg = new ButtonGroup();
		

		JButton btn1 = new JButton("50 Min");
		JButton btn2 = new JButton("75 Min (1 hr. 15 min.)");
		JButton btn3 = new JButton("110 Min (1 hr. 50 min.)");
		JButton btn4 = new JButton("120 Min (2 hrs.)");
		JButton btn5 = new JButton("180 Min (3 hrs.)");
		JToggleButton theme = new JToggleButton("Dark/Light Mode");
		
		

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setStringSelected("1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setStringSelected("2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setStringSelected("3");
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setStringSelected("4");
			}
		});
		
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graphicPanel.setStringSelected("5");
			}
		});

		theme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(graphicPanel.getBackground() == Color.white) {
					graphicPanel.setBackground(Color.black);
					btn1.setForeground(Color.green);
					btn2.setForeground(Color.green);
					btn3.setForeground(Color.green);
					btn4.setForeground(Color.green);
					btn5.setForeground(Color.green);
					theme.setForeground(Color.green);
				} else {
					graphicPanel.setBackground(Color.white);
					btn1.setForeground(Color.black);
					btn2.setForeground(Color.black);
					btn3.setForeground(Color.black);
					btn4.setForeground(Color.black);
					btn5.setForeground(Color.black);
					theme.setForeground(Color.black);
				}
			}
			
		});
		bg.add(btn1);
		bg.add(btn2);
		bg.add(btn3);
		bg.add(btn4);
		bg.add(btn5);
		bg.add(theme);;

		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		this.add(theme);

		
	}
}
