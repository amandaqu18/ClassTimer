import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GraphicPanel extends JPanel {
	private String selectedString;
	private AnimationTimer timer;
	private ProgressBar rectangle;
	
	public GraphicPanel() {
		super();
		this.setSize(1000, 1000);
		this.setBackground(Color.white);
		
		
		selectedString = "6";
		
		// Setting up the timer
		timer = new AnimationTimer(this);
		
		rectangle = new ProgressBar();
		rectangle.setSize(1, 1000);
		rectangle.setLocation(0, 0);
		rectangle.setColor(Color.blue);
		
				
		//Start the timer
		timer.setDelay(10800);
		timer.start();
	}

	public void move() {
		System.out.println(selectedString);
		if (selectedString.equalsIgnoreCase("1")) {
			rectangle.fill(3.6, 0);

		}
		else if (selectedString.equalsIgnoreCase("2")) {
			rectangle.fill(2.4,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("3")) {
			rectangle.fill(1.63,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("4")) {
			rectangle.fill(1.5,  0);
			
		}
		else if (selectedString.equalsIgnoreCase("5")) {
			rectangle.fill(1, 0);
			
		}
		else {
			rectangle.fill(0, 0);
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

	public void setStringSelected(String selectedString) {
		this.selectedString = selectedString;
	}
}
