package fr.dauphine.javaavance.td1;


public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public Point(Point p2) {
		this.x = p2.x;
		this.y = p2.y;
	}
	
	
	public boolean isSameAs(Point p){
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void translate(int dx, int dy) {
		this.x = x + dx;
		this.y = y + dy;
	}
	
	
	public int getX() {
		return x;
	}
	
	
	public int getY() {
		return y; 
	}
	
	
	public String toString() {
		return "("+ x + "," + y + ")";
	}
	
	
}
