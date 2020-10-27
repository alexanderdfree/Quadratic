public class TestQuadratic{
   	public static boolean testQuadY(){
		/*A test client, tests quadY(). Returns true if all tests
		passed, false if any failed. Prints an informative error
		message to System.out if a test fails
		*/
      
      double a, b, c, x, y;
      
      boolean allPassed = true;
      
      int i = 0;
      double result;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      x = -1.0;
      y = 1.5;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      x = 1.0;
      y = 20.0;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      x = 0.0;
      y = 4.0;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = -4.0;
      c = 4.0;
      x = 1.0;
      y = 0.0;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = 0.0;
      c = 0.0;
      x = 0.1;
      y = 0.01;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      x = Double.NaN;
      y = Double.NaN;
      result = Quadratic.quadY(x, a, b, c);
      //if(y != result){
      if(!(Double.isNaN(result))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      x = Double.POSITIVE_INFINITY;
      y = Double.POSITIVE_INFINITY;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = -1.0;
      b = -4.0;
      c = 4.0;
      x = Double.POSITIVE_INFINITY;
      y = Double.NEGATIVE_INFINITY;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      x = Double.NEGATIVE_INFINITY;
      y = Double.POSITIVE_INFINITY;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      i++;
      a = -1.0;
      b = -4.0;
      c = 4.0;
      x = Double.NEGATIVE_INFINITY;
      y = Double.NEGATIVE_INFINITY;
      result = Quadratic.quadY(x, a, b, c);
      if(y != result){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c + ", x = " + x);
         System.out.println(", result: "+ result + ", expected: " + y);
         allPassed = false;
      }
      
      return allPassed;
	}
   
   public static boolean testDiscriminant(){
      /*A test client, tests quadY(). Returns true if all tests
		passed, false if any failed. Prints an informative error
		message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = -15.0;
      result = Quadratic.discriminant(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 0.0;
      result = Quadratic.discriminant(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = 400.0;
      result = Quadratic.discriminant(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;
    }
    
    public static boolean testNumRoots(){
      /*A test client, tests numRoots(). Returns true if all tests
		passed, false if any failed. Prints an informative error
		message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = 0;
      result = Quadratic.numRoots(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 1;
      result = Quadratic.numRoots(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 1;
      result = Quadratic.numRoots(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
         
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = 2;
      result = Quadratic.numRoots(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      return allPassed;
   }
   
   public static boolean testPlusRoot(){
		/*A test client, tests plusRoot(). Returns true if all
		tests passed, false if any failed. Prints an informative
		error message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = Double.NaN;
      result = Quadratic.plusRoot(a, b, c);
      //if(result != expected){
      if(!Double.isNaN(result)){//have to switch the behavior here because of NaN weirdness1 %
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 2.0;
      result = Quadratic.plusRoot(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = -1.0;
      result = Quadratic.plusRoot(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;

	}
   
   public static boolean testMinusRoot(){
      /*A test client, tests plusRoot(). Returns true if all
		tests passed, false if any failed. Prints an informative
		error message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = Double.NaN;
      result = Quadratic.minusRoot(a, b, c);
      //if(result != expected){
      if(!Double.isNaN(result)){ //had to switch this manually because of weird NaN behavior
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 2.0;
      result = Quadratic.minusRoot(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = 3.0;
      result = Quadratic.minusRoot(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;
   }
   
   public static boolean testFindRoots(){
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      String result, expected;
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = "";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = "x = 2.0";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = "x = -1.0, x = 3.0";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = -10.0;
      c = 15.0;
      expected = "x = 1.5";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = 0.0;
      c = 15.0;
      expected = "";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = 0.0;
      c = 0.0;
      expected = "x = all values of x";
      result = Quadratic.findRoots(a, b, c);
      if(!(result.equals(expected))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;
    }
    
    public static boolean testXSym(){
      /*A test client, tests xSym(). Returns true if all
		tests passed, false if any failed. Prints an informative
		error message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = 1.0;
      result = Quadratic.xSym(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 2.0;
      result = Quadratic.xSym(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = -1.0;
      result = Quadratic.xSym(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = 5.0;
      c = 4.0;
      expected = Double.NaN;
      result = Quadratic.xSym(a, b, c);
      //if(result != expected){
      if(!(Double.isNaN(result))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;
    }
    
    public static boolean testYVertex(){
      /*A test client, tests yVertex(). Returns true if all
		tests passed, false if any failed. Prints an informative
		error message to System.out if a test fails
		*/
      double a, b, c;
      
      boolean allPassed = true;
      
      int i = 0;
      double result, expected;
      
      i++;
      a = -5.0;
      b = 10.0;
      c = 15.0;
      expected = 20.0;
      result = Quadratic.yVertex(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 1.0;
      b = -4.0;
      c = 4.0;
      expected = 0.0;
      result = Quadratic.yVertex(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 2.5;
      b = 5.0;
      c = 4.0;
      expected = 1.5;
      result = Quadratic.yVertex(a, b, c);
      if(result != expected){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      i++;
      a = 0.0;
      b = 5.0;
      c = 4.0;
      expected = Double.NaN;
      result = Quadratic.yVertex(a, b, c);
      //if(result != expected){
      if(!(Double.isNaN(result))){
         System.out.print("Failed Test " + i + ": ");
         System.out.print("a = " + a + ", b = " + b + ", c = "+ c);
         System.out.println(", result: "+ result + ", expected: " + expected);
         allPassed = false;
      }
      
      return allPassed;
   }

   
   public static void main(String[] args){
      /*The main method. When run, it should run your tests, print
		out any error messages, or a message that all tests were
		successful.

		After running your test clients, please print out the
      results of the following commands:
		*/
      
      System.out.println("----------------------------------------");
      System.out.println("Testing quadY():");
      if(testQuadY()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing discriminant():");
      if(testDiscriminant()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing numRoots():");
      if(testNumRoots()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing plusRoot:");
      if(testPlusRoot()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing minusRoot:");
      if(testMinusRoot()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing findRoots:");
      if(testFindRoots()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing xSym:");
      if(testXSym()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
      
      System.out.println("----------------------------------------");
      System.out.println("Testing yVertex:");
      if(testYVertex()) System.out.println("All Tests Passed");
      System.out.println("----------------------------------------");
   }
}