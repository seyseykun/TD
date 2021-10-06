package fr.dauphine.javaavance.td1;


import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		/*Point p1 = new Point(0,0);
		System.out.println(p1.getX() +" "+p1.getY());
		Point p2 = new Point(3,4);
		System.out.println(p2.getX() +" "+p2.getY());
		Point p3 = new Point(p2);
		System.out.println(p3.getX() +" "+p3.getY());
		System.out.println(p3);
		
		Point p4 = new TestPoint(0,0);
		System.out.println(p4.getX() +" "+p4.getY());
		Point p5 = new Point(8,2);
		System.out.println(p5.getX() +" "+p5.getY());*/ //Exercice1
		
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		Point p4 = new TestPoint(8,9);
						
		/*ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		
		//Polyline P1 = new Polyline(p1, p2);
		
		Point[] P = {p1, p2, p3};
		Polyline P1 = new Polyline(P);
		Polyline P2 = new Polyline();

		
		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
		System.out.println(p1);
		System.out.println(p4);
		
		System.out.println("\n" + p1.isSameAs(p3));
		System.out.println(p1.isSameAs(p2));
		System.out.println(p1.isSameAs(p4));

		System.out.println("\n" + Arrays.toString(P));
		System.out.println(P[0]);
		System.out.println(Arrays.toString(P1.getListpoints()));
		
		System.out.println("\n" + Arrays.toString(P2.getListpoints()));
		System.out.println(P2.getListpoints().length);
		
		P2.add(p1);
		P2.add(p4);
		P2.add(p4);
		P2.add(p4);
		P2.add(p4);
		P2.add(p1); //Lorsqu'on essaie d'ajouter une 6ème valeur, la liste n'est pas modifiée.
		
		System.out.println("\n" + Arrays.toString(P2.getListpoints()));
		
		System.out.println("\n" + P2.pointCapacity());
		
		System.out.println("\n" + P2.nbPoints());
		
		System.out.println("\n" + P2.contains(p1));
		System.out.println(P2.contains(p4));
		
		
		Polyline P3 = new Polyline(4);
		P3.add(p1);
		P3.add(p4);
		P3.add(null);
		
		System.out.println("\n" + Arrays.toString(P3.getListpoints()));
		System.out.println(P2.contains(null));*/
		
		/*
		LinkedList <Point> P =  new LinkedList <Point> ();
		P.add(p1);
		P.add(p4);
		P.add(null);
		Polyline P1 = new Polyline(P);
		Polyline P2 = new Polyline();
		
		System.out.println(P);
		System.out.println(P1.getListpoints());
		System.out.println(P2.getListpoints());
		System.out.println(P1.pointCapacity());
		System.out.println(P1.nbPoints());
		System.out.println(P1.contains(p1));
		System.out.println(P1.contains(p3));
		System.out.println(P1.contains(p2));
		System.out.println(P1.contains(p4));
		*/
		
		Circle c1 = new Circle(p1,2);
		Circle c2 = new Circle(p2,1);
		Circle c3 = new Circle(new Point(5,0), 5);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 + ". " + c2);
		
		c1.translate(10, 10);
		System.out.println("\n" + c1);
		System.out.println(c1 + ". " + c2);
		
		c3.getCenter();
		System.out.println("\n" + c3);
		
		c3.getCenter().translate(1,2);
		System.out.println(c3);
		
		System.out.println(c3.contains(new Point(10,0)));
		System.out.println(Circle.contains(new Point(10,0), c1, c3));
		System.out.println(Circle.contains(new Point(10,10), c1, c3));
		
		
		Ring r1 = new Ring(p1, 1, 2);
		Ring r2 = new Ring(p1, 1, 2);
		Ring r3 = new Ring(p3, 1, 2);
		
		System.out.println("\n" + r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r1.getCenter().getX());
		
		System.out.println("\n" + r1);
	}
}	