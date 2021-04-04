import javax.swing.JFrame;

public class App {
	// Constructor
	public App() {
		JFrame frame = new JFrame("Class Timer"); // Create an instance of the JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close when x clicked
		frame.add(new MainPanel()); // We will never need a reference or a way to access that variable of type
									// MainPanel; only add top frame
		frame.pack(); // Resize the frame; pack the frame to take same size as panel
		frame.setVisible(true); // So the frame gets displayed
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new App(); // Instance of the App
	}

}
