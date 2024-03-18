/**
 * @repo: https://github.com/zMynxx/maman-11
 * @file: Triangle.java
 * @autor: Lior Dux
 * @date: 2024-03-18
 * @version: 1.0
 * @description:
 * This program calculates the area and the perimeter of a given triangle.
 * The user is asked to enter the three lengths of the triangle's sides.
 * 
 */

import java.util.Scanner;
public class Triangle
{
  /**
	* @description: This method calculates the area and the perimeter of a triangle using user input. 
	* @param args
	* @return void
	*/
  public static void main (String [] args)
  {
    Scanner scan = new Scanner (System.in);
    System.out.println ("This program calculates the area "
                      + "and the perimeter of a given triangle. ");
    System.out.println ("Please enter the three lengths"
                      + " of the triangle's sides");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    double s = (a + b + c) / 2.0;
    double area = Math.sqrt (s * (s - a) * (s - b) * (s - c));
    System.out.println ("The lengths of the triangle sides are: " + a + ", " + b + ", " + c);
    if (a + b <= c || a + c <= b || b + c <= a)
    {
      System.out.println ("The given three sides don't represent a triangle");
      return;
    }
    System.out.println ("The perimeter of the triangle is: " + (a + b + c));
    System.out.println ("The area of the triangle is: " + area);
 } // end of method main
} //end of class Triangle
