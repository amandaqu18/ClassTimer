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
		this.setSize(1000, 1000);
		this.setBackground(Color.gray);
		
		selectedString = "1";
		
		// Setting up the timer
		timer = new AnimationTimer(this);
		
		rectangle = new Rectangle();
		rectangle.setSize(50, 1000);
		rectangle.setLocation(0, 0);
		rectangle.setColor(Color.blue);
		
				
		//Start the timer
		timer.start();
	}

	public void move(double dx, double dy) {
		timer.setDelay(1000);
		if (selectedString.equalsIgnoreCase("1")) {
			rectangle.expand(3, 0);
		}
		else if (selectedString.equalsIgnoreCase("2")) {
			rectangle.expand(22,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("3")) {
			rectangle.expand(15,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("4")) {
			rectangle.expand(13.8,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("5")) {
			rectangle.expand(09.25, 0);
			
		}
		if(rectangle.getWidth() > this.getWidth()) {
			rectangle.setSize(1, 1000);
		}
		this.repaint();
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
