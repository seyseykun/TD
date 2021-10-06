package fr.dauphine.javaavance.td1;

/*Array is a fixed length data structure 
  whereas ArrayList is a variable length Collection class. 
  We cannot change length of array once created in Java 
  but ArrayList can be changed.*/

import java.util.*;

public class Polyline{
	
	/*private Point p1;
	private Point p2;
	

	
	public Polyline(Point p1, Point p2) { 
		
		this.p1 = p1;
		this.p2	= p2;
		
	}
	
	public Point getp1() {
		return p1;
	}
	
	public Point getp2() {
		return p2;
	}

	
	public String toString() {
		return "[" + p1 + "," + p2 + "]";
	}*/
	
	//Le code passé en commentaire permet de créer un polyline à partir de Point et non à partir d'une array de Point
	
	
	
	
	/*private Point[] listpoints;
	
	public Polyline() {
		this.listpoints = new Point[5];
	}
	
	public Polyline(int max) {
		this.listpoints = new Point[max];
	}
	
	public Polyline(Point[] listpoints){
		this.listpoints = listpoints;
	}
	
	public Point[] getListpoints(){
		return listpoints;
	}
	
	public void add(Point p) {
		for(int i = 0 ; i<listpoints.length ; i++) {
			if (listpoints[i] == null) {
				listpoints[i] = p;
				break;
			}
		}
	}
	
	public int pointCapacity() {
		return listpoints.length;
	}
	
	public int nbPoints() {
		int nb = 0;
		for(int i = 0 ; i<listpoints.length ; i++) {
			if (listpoints[i] != null) {
				nb = nb + 1;
			}
		}
		return nb;
	}
	
	public boolean contains(Point p) {

		for (Point pi : listpoints) {
			if (pi == p) {
				return true;
			}
		}
		return false;
	}*/
	
	private LinkedList<Point> listpoints;
	
	public Polyline() {
		this.listpoints = new LinkedList<Point>();
	}
	
	
	public Polyline(LinkedList<Point> listpoints){
		this.listpoints = listpoints;
	}
	
	public LinkedList<Point> getListpoints(){
		return listpoints;
	}
	
	
	public int pointCapacity() {
		return listpoints.size();
	}
	
	public int nbPoints() {
		int nb = 0;
		for(int i = 0 ; i<listpoints.size() ; i++) {
			if (listpoints.get(i) != null) {
				nb = nb + 1;
			}
		}
		return nb;
	}
	
	public boolean contains(Point p) {
		for (Point pi : listpoints) {
			if (pi == p) {
				return true;
			}
		}
		return false;
	}
}

