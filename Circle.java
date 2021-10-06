package fr.dauphine.javaavance.td1;

public class Circle {

	private Point p;
	private int radius;
	
	public Circle(Point p, int radius) {
		this.p = p;
		this.radius = radius;
	}
	
	public String toString() {
		return "Cercle de centre " + p + ", de rayon " + radius + " et d'aire " + area();
	}
	
	public void translate(int dx, int dy) {
		p.translate(dx, dy);
	}
	
	
	public double area() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public Point getCenter() {
		return p;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public boolean contains(Point px) {
		if (Math.sqrt(Math.pow((p.getX()-px.getX()), 2)+Math.pow((p.getY()-px.getY()), 2)) <= radius) {
			return true;
		}
		return false;
	}
	
	public static boolean contains(Point px, Circle... circles) {
		for (Circle c : circles) {
			if (Math.sqrt(Math.pow((c.getCenter().getX()-px.getX()), 2)+Math.pow((c.getCenter().getY()-px.getY()), 2)) <= c.getRadius()) {
				return true;
			}
		}
		return false;
	}
}
