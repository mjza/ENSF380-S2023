/**
 * Example 12-1
 */
package edu.ucalgary.ensf409;

public class Sample {
   void dynamicArgumentsMethod(Object... args) {
      for (Object arg : args) {
         System.out.print(arg.toString() + " ");
      }
      if(0 == args.length) {
    	  System.out.println("No argument passed.");
      } else {
    	  System.out.println("");
      }
   }
   public static void main(String args[] ) {
      new Sample().dynamicArgumentsMethod("Mahdi", "Jaberzadeh", "Ansari");
      new Sample().dynamicArgumentsMethod("Mahdi", "Ansari");
      new Sample().dynamicArgumentsMethod("Mahdi");
      new Sample().dynamicArgumentsMethod();
   }
}
