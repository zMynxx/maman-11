/**
 * @repo: https://github.com/zMynxx/maman-11
 * @file: TriangleTest.java
 * @autor: Lior Dux
 * @date: 2024-03-18
 * @version: 1.0
 * @description:
 * This program calculates the area and the perimeter of a given triangle.
 * The user is asked to enter the three lengths of the triangle's sides.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class TriangleTest {

    @Test
    public void testTriangleMain_ValidInput() {
        // Define input for a valid triangle
        String input = "3\n4\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output to capture console print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute main method
        Triangle.main(new String[0]);

        // Restore original System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Assert output
        String expectedOutput = "This program calculates the area and the perimeter of a given triangle. \n" +
                                "Please enter the three lengths of the triangle's sides\n" +
                                "The lengths of the triangle sides are: 3, 4, 5\n" +
                                "The perimeter of the triangle is: 12\n" +
                                "The area of the triangle is: 6.0\n";
        assertEquals(expectedOutput, outContent.toString());
    } // end of method testTriangleMaint_ValidInput

    @Test
    public void testTriangleMain_NonTriangleInput() {
        // Define input for non-triangular sides
        String input = "1\n2\n4\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output to capture console print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute main method
        Triangle.main(new String[0]);

        // Restore original System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Assert output
        String expectedOutput = "This program calculates the area and the perimeter of a given triangle. \n" +
                                "Please enter the three lengths of the triangle's sides\n" +
                                "The lengths of the triangle sides are: 1, 2, 4\n" +
                                "The given three sides don't represent a triangle\n";
        assertEquals(expectedOutput, outContent.toString());
   } // end of method testTriangleMain_NonTriangleInput
} //end of class TriangleTest
