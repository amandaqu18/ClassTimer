import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ControlPanel extends JPanel {
	private MainPanel radioButtonPanel;

	public ControlPanel(GraphicPanel drawingPanel) {
		this.setLayout(new BorderLayout());

		// Setting up the panel
		radioButtonPanel = new MainPanel(drawingPanel);
		radioButtonPanel.setBackground(Color.red);
		

		this.add(radioButtonPanel, BorderLayout.CENTER);

	}
}
