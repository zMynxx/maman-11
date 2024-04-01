/**
 * @repo: https://github.com/zMynxx/maman-11
 * @file: Triangle.java
 * @autor: Lior Dux
 * @date: 2024-04-01
 * @version: 1.1
 * @description:
 * This program calculates the area and the perimeter of a given triangle.
 * The user is asked to enter the three lengths of the triangle's sides, if the sides are not positive integers the user will be asked to enter the sides again.
 * 
 */

import java.util.Scanner;
public class Triangle
{
  /**
  * @description: This method calculates the area and the perimeter of a triangle using user input. 
  * @param args - the command line arguments
  * @return void
  */
  public static void main (String [] args)
  {
    // declare variables
    int a = 0, b = 0, c = 0;
    Scanner scan = new Scanner (System.in);
    System.out.println ("This program calculates the area "
                      + "and the perimeter of a given triangle. ");

    // get user input
    System.out.println ("Please enter the three lengths"
                      + " of the triangle's sides");
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();

    // validate user input
    while (a <= 0 || b <= 0 || c <= 0) {
      System.out.println("The sides of the triangle must be positive integers! Try again.");

      // get user input
      System.out.println ("Please enter the three lengths"
                        + " of the triangle's sides");
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
    }

    double s = (a + b + c) / 2.0;
    double area = Math.sqrt (s * (s - a) * (s - b) * (s - c));
    System.out.println ("The lengths of the triangle sides are: " + a + ", " + b + ", " + c);

    // check if the given sides represent a triangle
    if (a + b <= c || a + c <= b || b + c <= a)
    {
      System.out.println ("The given three sides don't represent a triangle");
      return;
    }
    System.out.println ("The perimeter of the triangle is: " + (a + b + c));
    System.out.println ("The area of the triangle is: " + area);
 } // end of method main
} //end of class Triangle
