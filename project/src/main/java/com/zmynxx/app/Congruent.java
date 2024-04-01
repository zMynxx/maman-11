/**
 * @repo: https://github.com/zMynxx/maman-11
 * @file: Congruent.java
 * @autor: Lior Dux
 * @date: 2024-03-18
 * @version: 1.0
 * @description: 
 * This program checks if two triangles are congruent.
 */

import java.util.Scanner;
public class Congruent {

    /**
    * @description: This program checks if two triangles are congruent by comparing the lengths of their sides.
    * @param args
    * @return void
    */
    public static void main (String [] args)
    {
      Scanner scan = new Scanner (System.in);

      System.out.println ("Please enter the coordinates of the 3 " +
                          "vertices of the first triangle:");
      System.out.println ("Enter the first vertex (2 real numbers)");
      double x11 = scan.nextDouble();
      double y11 = scan.nextDouble();
      System.out.println ("Enter the second vertex (2 real numbers)");
      double x12 = scan.nextDouble();
      double y12 = scan.nextDouble();
      System.out.println ("Enter the third vertex (2 real numbers)");
      double x13 = scan.nextDouble();
      double y13 = scan.nextDouble();

      System.out.println ("Please enter the coordinates of the 3 " +
                          "vertices of the second triangle:");
      System.out.println ("Enter the first vertex (2 real numbers)");
      double x21 = scan.nextDouble();
      double y21 = scan.nextDouble();
      System.out.println ("Enter the second vertex (2 real numbers)");
      double x22 = scan.nextDouble();
      double y22 = scan.nextDouble();
      System.out.println ("Enter the third vertex (2 real numbers)");
      double x23 = scan.nextDouble();
      double y23 = scan.nextDouble();

      System.out.println ("The first triangle is (" + x11 + "," + y11 + ") (" + x12 + "," + y12 + ") (" + x13 + "," + y13 + ").");
      double a1 = Math.sqrt(Math.pow(x12 - x11, 2) + Math.pow(y12 - y11, 2));
      double b1 = Math.sqrt(Math.pow(x13 - x12, 2) + Math.pow(y13 - y12, 2));
      double c1 = Math.sqrt(Math.pow(x11 - x13, 2) + Math.pow(y11 - y13, 2));
      System.out.println ("Its lengths are " + a1 + ", " + b1 + ", " + c1 + ".");

      System.out.println ("The second triangle is (" + x21 + "," + y21 + ") (" + x22 + "," + y22 + ") (" + x23 + "," + y23 + ").");
      double a2 = Math.sqrt(Math.pow(x22 - x21, 2) + Math.pow(y22 - y21, 2));
      double b2 = Math.sqrt(Math.pow(x23 - x22, 2) + Math.pow(y23 - y22, 2));
      double c2 = Math.sqrt(Math.pow(x21 - x23, 2) + Math.pow(y21 - y23, 2));
      System.out.println ("Its lengths are " + a2 + ", " + b2 + ", " + c2 + ".");

      if (a1 == a2 && b1 == b2 && c1 == c2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else if (a1 == b2 && b1 == c2 && c1 == a2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else if (a1 == c2 && b1 == a2 && c1 == b2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else if (a1 == b2 && b1 == a2 && c1 == c2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else if (a1 == c2 && b1 == b2 && c1 == a2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else if (a1 == a2 && b1 == c2 && c1 == b2)
      {
        System.out.println ("The triangles are congruent.");
      }
      else
      {
        System.out.println ("The triangles are not congruent.");
      }
   } // end of method main
} //end of class Congruent
