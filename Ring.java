package fr.dauphine.javaavance.td1;

public class Ring extends Circle {

	
	int innerradius;
	public Ring(Point p, int innerradius, int outerradius) {
		super(p, outerradius);
		this.innerradius = innerradius;
	}
	
	public boolean equals(Ring r){
		if (this.getCenter().getX() == r.getCenter().getX() && this.getCenter().getY() == r.getCenter().getY() && this.innerradius == r.innerradius && this.getRadius() == r.getRadius()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Anneau de centre " + getCenter() + ", de rayon externe " + getRadius() + " et de rayon interne " + innerradius;
	}


	public boolean contains(Point px) {
		if (Math.sqrt(Math.pow((getCenter().getX()-px.getX()), 2)+Math.pow((getCenter().getY()-px.getY()), 2)) <= getRadius() && Math.sqrt(Math.pow((getCenter().getX()-px.getX()), 2)+Math.pow((getCenter().getY()-px.getY()), 2)) >= getRadius()) {
			return true;
		}
		return false;
	}
	
	public static boolean contains(Point px, Circle... circles) {
		for (Circle c : circles) {
			if (Math.sqrt(Math.pow((c.getCenter().getX()-px.getX()), 2)+Math.pow((c.getCenter().getY()-px.getY()), 2)) <= c.getRadius() && Math.sqrt(Math.pow((c.getCenter().getX()-px.getX()), 2)+Math.pow((c.getCenter().getY()-px.getY()), 2)) >= c.getRadius()) {
				return true;
			}
		}
		return false;
	}
}
