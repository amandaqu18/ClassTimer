
public class ProgressBar extends Rectangle{
	private double x;
	private double y;
	
	public ProgressBar() {
		super();
	}
	
	public void fill(double d, double e) {
		this.setSize(this.getWidth() + d, this.getHeight() + e);
	}
}
