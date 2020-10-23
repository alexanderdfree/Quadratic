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
      return a;
	}

	public static void testQuadY(){
		/*A test client, tests quadY()
		*/
	}
	
	public static double discriminant(double a, double b, double c){
		/*Returns the discriminant given a, b, and c
		*/
      return c;
	}

	public static void testDiscriminant(){
		/*A test client, tests discriminant()
	}
	
	public static int numRoots(double a, double b, double c){
		/*Returns the number of roots given a, b, and c
		*/
	}

	public static void testNumRoots(){
		/*A test client, tests numRoots().
	}

	public static double plusRoot(double a, double b, double c){
		/*Finds the "plus" root of the quadratic given a, b, c,i.e. 		(-b + sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
		*/
	}
   public static double plusRoot(double a, double b, double c){
		return (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	}
   
	public static void testPlusRoot(){
		/*A test client, tests plusRoot()
		*/
	}

	public static double minusRoot(double a, double b, double c){
		/*Find the "minus" root of the quadratic given a, b, c,i.e.
		(-b - sqrt(b^2-4ac))/(2a) <- this is not proper Java syntax
		If there is no root return NaN (read more about NaN here)
		*/
      return (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
	
   }

	public static void testMinusRoot(){
		/*A test client, tests minusRoot()
		*/
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
      if (Quadratic.discriminant())
      return "b";
	}

	public static void testFindRoots(){
		/*A test client, tests findRoots()
		*/
	}

	public static double xSym(double a, double b, double c){
		/*Find the x-coordinate of the line of symmetry of
		y = ax^2+bx+c
      
		*/
      return a;
	}

	public static void testXSym(){
		/*A test client, tests xSym().
		*/
	}

	public static double yVertex(double a, double b, double c){
		/*Find the y-coordinate of the vertex given a, b, c
		*/
      return a;
	}
	
	public static void testYVertex(){
		/*A test client, tests yVertex().
		*/
	}

	public static void main(String[] args){
		/*The main method. When run, it should run your tests
		*/
	}
}