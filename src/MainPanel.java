import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
	public MainPanel() {
		this.setBackground(java.awt.Color.white);
		this.setPreferredSize(new java.awt.Dimension(500, 1000));
		this.setSize(new java.awt.Dimension(500, 1000));
		ButtonGroup bg = new ButtonGroup();
		JPanel buttonRow = new JPanel();
		buttonRow.add(new Buttons("50 Min", bg));
		buttonRow.add(new Buttons("75 Min (1 hr. 15 min.)", bg));
		buttonRow.add(new Buttons("110 Min (1 hr. 50 min.)", bg));
		buttonRow.add(new Buttons("120 Min (2 hrs.)", bg));
		buttonRow.add(new Buttons("180 Min (3 hrs.)", bg));
	}
}
