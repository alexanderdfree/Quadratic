/* Quadratic.java is a program that is a toolkit for all your quadratic needs!

made by Alex and Edwin

Last updated 10/30/20 */

public class Quadratic{
	public static double quadY(double x, double a, double b,
double c){
		/*Returns the y-value for the given x, a, b, and c
		Inputs:
			double x: the x-coordinate
			double a: "a" in y = ax^2 + bx + c
			double b: "b" in y = ax^2 + bx + c
			double c: "c" in y = ax^2 + bx + c
		Outputs:
			return: the y-coordinate at x given a, b, c
		*/
      return a*Math.pow(x, 2)+b*x+c;
	}

	public static void testQuadY(){
		/*A test client, tests quadY()
		*/
	}
	
	public static double discriminant(double a, double b, double c){
		/*Returns the discriminant given a, b, and c
	   Inputs:
			double a: "a" in y = (b^2) - 4ac
			double b: "b" in y = (b^2) - 4ac
			double c: "c" in y = (b^2) - 4ac
		Outputs:
			return: the discriminants given a, b, c
      */
      return ((Math.pow(b, 2))-(4.0 * a *c));
	}

	public static void testDiscriminant(){
		/*A test client, tests discriminant()
      */
      Testing.testEquals("Test 1", discriminant(1, -2, 1), 0.0);
      Testing.testEquals("Test 2", discriminant(-1, 0, 1), 4.0);
      Testing.testEquals("Test 3", discriminant(-1, 3, -5), -11.0);

	}
	
	public static int numRoots(double a, double b, double c){
		/*Returns the number of roots given a, b, and c
      Inputs:
			double x: the x-coordinate
			double a: "a" in y = ax^2 + bx + c
			double b: "b" in y = ax^2 + bx + c
			double c: "c" in y = ax^2 + bx + c
		Outputs:
			return: the y-coordinate at x given a, b, c
		*/
      if (discriminant(a,b,c) < 0) return 0;
      if (discriminant(a,b,c) == 0) return 1;
      else return 2;
	}

	public static void testNumRoots(){
		/*A test client, tests numRoots().*/
      Testing.testEquals("Test 1", numRoots(1, -2, 1), 1);
      Testing.testEquals("Test 2", numRoots(-1, 0, 1), 2);
      Testing.testEquals("Test 3", numRoots(-1, 3, -5), 0);
	}

	public static double plusRoot(double a, double b, double c){
		/*Finds the "plus" root of the quadratic given a, b, c,i.e. 		(-b + sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
      //if (numRoots(a, b, c) == 0) return "NaN";*/
      return (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	}
   
	public static void testPlusRoot(){
		/*A test client, tests plusRoot()
		*/
      Testing.testEquals("Test 1", plusRoot(1, -2, 1), 1.0);
      Testing.testEquals("Test 2", plusRoot(-1, 0, 1), -1.0);
      Testing.testEquals("Test 3", plusRoot(-1, 3, -5), "NaN");
      
	}

	public static double minusRoot(double a, double b, double c){
		/*Find the "minus" root of the quadratic given a, b, c,i.e.
		(-b - sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
		*/
      //if (numRoots(a, b, c) == 0) return "NaN";
      return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	
   }

	public static void testMinusRoot(){
		/*A test client, tests minusRoot()
		*/
      Testing.testEquals("Test 1", minusRoot(1, -2, 1), 1.0);
      Testing.testEquals("Test 2", minusRoot(-1, 0, 1), 1.0);
      Testing.testEquals("Test 3", minusRoot(-1, 3, -5), "NaN");
	}

	public static String findRoots(double a, double b, double c){
		/*Given a, b, and c, find the roots, if any, of the 				quadratic equation y = ax^2 + bx + c. Return a String 				containing this information, with the roots in order
		from smallest to greatest.

		Must work for all possible values of a, b, and c

		Ex:
		findRoots(-5.0, 10.0, 15.0) -> "x = -1.0 and x = 3.0"
		findRoots(1.0, -4.0, 4.0) -> "x = 2.0"
		findRoots(2.5, 5.0, 4.0) -> ""
		*/
      if (numRoots(a,b,c) == 0) return "";
      if (numRoots(a,b,c) == 1) return "x = "+ (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
      else return "x = " + (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a) + " and x = " + (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	}

	public static void testFindRoots(){
		/*A test client, tests findRoots()
		*/
      Testing.testEquals("Test 1", findRoots(1, -2, 1), "x = 1.0");
      Testing.testEquals("Test 2", findRoots(-1, 0, 1), "x = -1.0 and x = 1.0");
      Testing.testEquals("Test 3", findRoots(-1, 3, -5), "");
	}

	public static double xSym(double a, double b, double c){
		/*Find the x-coordinate of the line of symmetry of
		y = ax^2+bx+c
      Inputs:
			double a: "a" in y = -b/2a
			double b: "b" in y = -b/2a
		Outputs:
			return: the axis of symmetry at x given a and b
      */
      
      return (-b)/(2 * a);
	}

	public static void testXSym(){
		/*A test client, tests xSym().
		*/
      Testing.testEquals("Test 1", xSym(1, -2, 1), 1.0);
      Testing.testEquals("Test 2", xSym(-1, 0, 1), 0.0);
      Testing.testEquals("Test 3", xSym(-1, 3, -5), 1.5);
	}

	public static double yVertex(double a, double b, double c){
		/*Find the y-coordinate of the vertex given a, b, c
		*/
      double x = (-b)/(2 * a);
      double y = a*(Math.pow(x,2)) - b*x + c;
      return y; 
      
	}
	
	public static void testYVertex(){
		/*A test client, tests yVertex().
		*/
      Testing.testEquals("Test 1", yVertex(1, -2, 1), 0);
      Testing.testEquals("Test 2", yVertex(-1, 0, 1), 1);
      Testing.testEquals("Test 3", yVertex(-1, 3, -5), -2.75);
	}

	public static void main(String[] args){
		/*The main method. When run, it should run your tests
		*/
      testPlusRoot();
      testMinusRoot();
      testQuadY();
      testDiscriminant();
      testNumRoots();
      testYVertex();
      testXSym();
      testFindRoots();
	}
   
}