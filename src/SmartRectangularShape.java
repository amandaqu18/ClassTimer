import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.RectangularShape;

public class SmartRectangularShape {
	private RectangularShape _shape;
	private Color _fillColor, _borderColor;
	private double _rotation;
	private int _borderThickness;
	private double deltaX, deltaY, newX, newY;
	
	public SmartRectangularShape(RectangularShape shape) {
		_shape = shape;
		_fillColor = Color.red;
		_borderColor = Color.red;
		_borderThickness = 0;
		setLocation(250, 225);
		setSize(100, 100);
	}

	public SmartRectangularShape(RectangularShape shape, int x, int y) {
		_shape = shape;
		_fillColor = Color.red;
		_borderColor = Color.red;
		_borderThickness = 0;
		setLocation(x, y);
		setSize(100, 100);
	}

	public SmartRectangularShape(RectangularShape shape, Color color) {
		_shape = shape;
		_fillColor = color;
		_borderColor = color;
		_borderThickness = 0;
		setLocation(250, 225);
		setSize(100, 100);
	}

	public int getXLocation() {
		return (int) _shape.getX();
	}

	public int getYLocation() {
		return (int) _shape.getY();
	}

	public void setLocation(double d, double e) {
		_shape.setFrame(d, e, _shape.getWidth(), _shape.getHeight());
		newX = d;
		newY = e;
	}

	public int getWidth() {
		return (int) _shape.getWidth();
	}

	public int getHeight() {
		return (int) _shape.getHeight();
	}

	public void setWidth(int w) {
		_shape.setFrame(_shape.getX(), _shape.getY(), w, _shape.getHeight());
	}

	public void setHeight(int h) {
		_shape.setFrame(_shape.getX(), _shape.getY(), _shape.getWidth(), h);
	}

	public void setSize(int w, int h) {
		_shape.setFrame(_shape.getX(), _shape.getY(), w, h);
	}

	public void setColor(Color c) {
		_fillColor = c;
		_borderColor = c;
	}

	public Color getFillColor() {
		return _fillColor;
	}

	public void setFillColor(Color c) {
		_fillColor = c;
	}

	public Color getBorderColor() {
		return _borderColor;
	}

	public void setBorderColor(Color c) {
		_borderColor = c;
	}

	public double getRotation() {
		return _rotation * 180 / Math.PI;
	}

	public void setRotation(double degrees) {
		_rotation = degrees * Math.PI / 180;
	}

	public int getBorderThickness() {
		return _borderThickness;
	}

	public void setBorderThickness(int thickness) {
		_borderThickness = thickness;
	}

	public void move(double deltaX, double deltaY) {
		this.setLocation(newX + deltaX , newY + deltaY);
	}
	
	//Checking to see if you click on the point
	public boolean contains(Point p){
		return _shape.contains(p);
	}
	
	// Paint method
	public void paint(Graphics2D brush) {
		// Rotates the brush so that it find the center of the
		brush.rotate(_rotation, _shape.getCenterX(), _shape.getCenterY());
		// Setting the brushes color and using that color to paint the inside of the
		// shape.
		brush.setColor(_fillColor);
		brush.fill(_shape);
		// This is painting the border and setting how thick the border is supposed to
		// be.
		java.awt.Stroke oldStroke = brush.getStroke();
		brush.setColor(_borderColor);
		brush.setStroke(new BasicStroke(_borderThickness));
		brush.draw(_shape);
		brush.setStroke(oldStroke);
		// This is rotating the brush so that if the shape is rotated the brush can
		// account for that.
		brush.rotate(-_rotation, _shape.getCenterX(), _shape.getCenterY());
	}
}
