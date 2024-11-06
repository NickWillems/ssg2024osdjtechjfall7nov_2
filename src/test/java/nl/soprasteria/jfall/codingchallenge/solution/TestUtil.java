package nl.soprasteria.jfall.codingchallenge.solution;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestUtil {
    public static String runTest(String input) {
        InputStream stream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(stream); // Set input

        ByteArrayOutputStream solutionOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(solutionOutput)); // Capture output

        Solution.main(new String[]{}); // Call the correct class main method

        return solutionOutput.toString().trim(); // Return captured output
    }
}
