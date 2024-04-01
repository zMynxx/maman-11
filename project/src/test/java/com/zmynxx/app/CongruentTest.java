/**
 * @repo: https://github.com/zMynxx/maman-11
 * @file CongruentTest.java
 * @author Lior Dux @zMynxx
 * @date: 2024-03-18
 * @version: 1.0
 * @description: 
 * This program checks if two triangles are congruent.
 */

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CongruentTest {

    /**
     * @brief Test congruent triangles
     */
    @Test
    public void testCongruentMain_CongruentTriangles() {
        // Define input for congruent triangles
        // String input = "0 0\n3 0\n0 4\n0 0\n4 0\n0 3\n";
        String input = "0.0 0.0\n0.0 4.0\n3.0 0.0\n5.0 1.0\n5.0 5.0\n8.0 1.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output to capture console print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute main method
        Congruent.main(new String[0]);

        // Restore original System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Assert output
        String expectedOutput = "Please enter the coordinates of the 3 vertices of the first triangle:\n" +
                                "Enter the first vertex (2 real numbers)\n" +
                                "Enter the second vertex (2 real numbers)\n" +
                                "Enter the third vertex (2 real numbers)\n" +
                                "Please enter the coordinates of the 3 vertices of the second triangle:\n" +
                                "Enter the first vertex (2 real numbers)\n" +
                                "Enter the second vertex (2 real numbers)\n" +
                                "Enter the third vertex (2 real numbers)\n" +
                                "The first triangle is (0.0,0.0) (0.0,4.0) (3.0,0.0).\n" +
                                "Its lengths are 4.0, 5.0, 3.0.\n" +
                                "The second triangle is (5.0,1.0) (5.0,5.0) (8.0,1.0).\n" +
                                "Its lengths are 4.0, 5.0, 3.0.\n" +
                                "The triangles are congruent.\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    /**
     * @brief Test non-congruent triangles
     */
    @Test
    public void testCongruentMain_NonCongruentTriangles() {
        // Define input for non-congruent triangles
        String input = "0.0 0.0\n3.0 0.0\n0.0 4.0\n0.0 0.0\n4.0 0.0\n0.0 5.0\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output to capture console print
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Execute main method
        Congruent.main(new String[0]);

        // Restore original System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Assert output
        // Assert output
        String expectedOutput = "Please enter the coordinates of the 3 vertices of the first triangle:\n" +
                                "Enter the first vertex (2 real numbers)\n" +
                                "Enter the second vertex (2 real numbers)\n" +
                                "Enter the third vertex (2 real numbers)\n" +
                                "Please enter the coordinates of the 3 vertices of the second triangle:\n" +
                                "Enter the first vertex (2 real numbers)\n" +
                                "Enter the second vertex (2 real numbers)\n" +
                                "Enter the third vertex (2 real numbers)\n" +
                                "The first triangle is (0.0,0.0) (3.0,0.0) (0.0,4.0).\n" +
                                "Its lengths are 3.0, 5.0, 4.0.\n" +
                                "The second triangle is (0.0,0.0) (4.0,0.0) (0.0,5.0).\n" +
                                "Its lengths are 4.0, 6.4031242374328485, 5.0.\n" +
                                "The triangles are not congruent.\n";
        assertEquals(expectedOutput, outContent.toString());
    } // end of method testCongruentMain_NonCongruentTriangles
} // end of class CongruentTest
