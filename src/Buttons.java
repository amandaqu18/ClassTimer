import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons extends JButton {
	private JLabel label;
	public Buttons(JLabel label, ButtonGroup bg, ActionListener actionListener) {
		this.label = label;
		bg.add(this);		
	}
}
