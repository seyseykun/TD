# TD
TDs de Java Avancé

Exercice 2.
1.	Cela fonctionne car Point possède un constructeur par défaut et car les valeurs x et y sont par défaut de 0. De plus, x et y sont en « private » mais la méthode se trouve dans la même classe que x et y, donc la méthode a accès à x et y.

2.	On rencontre une erreur car les attributs x et y sont en private, donc la class TestPoint n’a pas accès à la valeur de ces attributs. Pour remédier à ce problème, on peut passer les attributs x et y en protected. 
Un membre marqué dans une classe comme étant protégé (protected) peut être manipulé :
-	Dans la classe qui définit ce membre,
-	Dans les classes qui dérivent de la classe considérée,
-	Et dans toutes les classes (et les types) définies dans le même package que celle qui définit le membre protégé.
public - Any class/function may access the method/property.
protected - Only this class and any subclasses may access the method/property.
private - Only this class may access the method/property. It won't even be inherited.
3.	Cela rend la classe plus encapsulée et cela empêche les autres classes de modifier le code des éléments en private.

4.	C’est une méthode qui retourne la valeur d’un attribut. On appelle ça un getter et on le nomme getX(). 
Ici on en a besoin car on a mis x et y en private, nous ne pouvons pas accéder à leur valeur sans le getter. 

5.	En créant ce constructeur, on a remplacé le constructeur par défaut de Point. Ainsi, on rencontre une erreur lorsqu’on écrit « Point p = new Point() » car il n’y a pas de paramètre. Il faut renseigner des paramètres, par exemple : « Point p = new Point(0,0) »

6.	 ??? Si on modifie les paramètres du constructeur sans modifier les lignes de code du constructeur, on rencontre une erreur. 

public Point(int x, int y) {
		this.x = px;
		this.y = py;		
	}
Si on modifie les paramètres mais également les lignes de code, on ne rencontre pas d’erreur. 

public Point(int x, int y) {
		this.x = x;
		this.y = y;		
	}
7.	P

8.	Le compilateur sait à quel constructeur faire appel car les paramètres des deux constructeurs ne sont pas les mêmes. Si le point a en paramètre 2 entiers, il fera appel au premier constructeur qu’on a créé. Si le point a en paramètre 1 point, il fera appel au second constructeur qu’on a créé.

9.	Voici ce qu’il faut ajouter à la classe Point :

public String toString() {
		return "("+ x + "," + y + ")";
	}


Exercice 3 : Equality.
1.	This code prints true and false because p1 and p2 have the same reference because of the line p2 = p1), but the point p3 have a different reference even if it has the same value for x and y as the points p1 and p2.

In Java, the == operator compares those two references are identical or not. Whereas the equals() method compares two objects.
Objects are equal when they have the same state (usually comparing variables). Objects are identical when they share the class identity.
For example, the expression obj1==obj2 tests the identity, not equality. While the expression obj1.equals(obj2) compares equality.

2.	Method isSameAs(Point)

3.	indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
Here the point p1 is in the ArrayList and the point p2 has the same reference as p1. So, the index of p1 (and p2) is 0 because it is the first (and only) object in the ArrayList. On the other side, the point p3 is contained in the ArrayList, so it returns -1. 

??? Faut-il créer une fonction qui remplacera indexOf pour laquelle le point 3 appartient à la liste ?



Exercice 4 : Polyline

4.	If null is given instead of an actual Point object, the method contains return false. If I add(null) before, the method contains still return false. 

5.	requireNonNull(T obj)
“Checks that the specified object reference is not null.”

??



Exercice 5 : Mutability and circle
1.	.
2.	.
3.	.
4.	.

5.	The problem is that when you translate the circle c2, the circle c will also be translated. To avoid it, we need to define the 2 circles with two different points (2 points that don’t have the same reference)

6.	Circle c=new Circle(new Point(1,2), 1);
c.getCenter().translate(1,1);
System.out.println(c); 
Il n’y a aucun problème ?? Lorsque j’exécute ce code, il renvoie exactement ce qu’on attend. 

7.	.
8.	Soit c le centre du cercle et r son rayon. Pour tout point x compris dans le cercle (c, r), on peut construire une droite (cx) passant par le centre du cercle et par le point x. On peut construire une droite (xr) perpendiculaire à la droite (cx) au point x, cette droite (xr) passe donc par x et traverse le cercle. On peut construire une droite (r) qui passe par le centre c du cercle et qui coupe la droite (xr) au niveau du rayon du cercle. 
Le triangle formé par les 3 points d’intersections des droites (cx) et (xr), (xr) et (r), (cx) et (r) est donc rectangle. 
Son hypoténuse est de longueur r. 
Le côté passant par le point c et le point r est de longueur sqrt((c1 – x1)² + (c2 – x2)²) avec c le point de coordonnées (c1, c2) et x le point de coordonnées (x1, x2). Cette longueur correspond à la distance entre c et x.
Si cette longueur est supérieure à r, cela signifie que le point x n’est pas dans le cercle.
Si cette longueur est égale à r, cela signifie que le point x est sur le cercle.
Si cette longueur est inférieure à r, cela signifie que le point x est compris dans le cercle.

Exercice 6 : Anneaux

4.	Si on fait System.out.println(ring); sans code complémentaire, cela nous renvoie ce qui a été défini dans la méthode toString() de la class Circle. Il faut redéfinir une méthode toString pour cette classe. 



