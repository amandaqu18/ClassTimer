import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel {
	private String selectedString;
	private AnimationTimer timer;
	private Rectangle rectangle;
	
	public GraphicPanel() {
		super();
		
		// Setting up the timer
		timer = new AnimationTimer(this);
		
		rectangle = new Rectangle();
		rectangle.setSize(1, 1000);
		rectangle.setLocation(0, 0);
		rectangle.setColor(Color.red);
		
		this.selectedString = selectedString;
				
		//Start the timer
		timer.start();
	}

	public void move(double dx, double dy) {
		if (selectedString.equalsIgnoreCase("1")) {
			rectangle.expand(0.0 , 0.5);
		}
		else if (selectedString.equalsIgnoreCase("2")) {
			rectangle.expand(0,  0.25);
			
		}
		else if (selectedString.equalsIgnoreCase("3")) {
			rectangle.move(0,  0.25);
			
		}
		else if (selectedString.equalsIgnoreCase("4")) {
			rectangle.move(0,  0.25);
			
		}
		rectangle.move(0.5, 0);
		if(rectangle.getHeight() > this.getHeight()) {
			rectangle.setSize(1000, 1);
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D) g;
		rectangle.paint(brush);
		this.repaint();
	}
	
	public String getStringSelected() {
		return selectedString;
	}

	public void setStringSelected(String selectedSelected) {
		this.selectedString = selectedString;
	}
}
