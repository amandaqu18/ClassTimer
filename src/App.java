import java.awt.BorderLayout;

import javax.swing.JFrame;

public class App extends JFrame{
	// Constructor
	public App() {
		this.setSize(1000, 1000);
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close when x clicked
		
		GraphicPanel graphicPanel = new GraphicPanel();
		ControlPanel controlPanel = new ControlPanel(graphicPanel);//Making instances so that we can pass in the main panel to the graphics panel.  
		
		this.add(graphicPanel, BorderLayout.CENTER);
		this.add(controlPanel,BorderLayout.SOUTH); // We will never need a reference or a way to access that variable of type
												// MainPanel; only add top frame
		
//		this.pack(); // Resize the frame; pack the frame to take same size as panel
		this.setVisible(true); // So the frame gets displayed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App(); // Instance of the App
	}

}
