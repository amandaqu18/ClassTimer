import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class AnimationTimer extends Timer {

	private GraphicPanel panel;
	private int dx = 0,dy = 0;

	public AnimationTimer(GraphicPanel panel) {
		// Calls the timer class
		super(1, null);
		// Adds new action listener
		this.addActionListener(new TickListener());
		this.panel = panel;
	}

	private class TickListener implements ActionListener {
		//Method required for action listeners 
		
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.move();
			panel.repaint();
		}
	}
}
