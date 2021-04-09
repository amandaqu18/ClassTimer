import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JButton {
	public Buttons(String label, ButtonGroup bg, ActionListener actionListener) {
		bg.add(this);
		this.addActionListener(actionListener);
		
	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		}

	}
}
