package com.example.tests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.HelloWorld;

public class HelloWorldE2ETest {
    @Test
    public void testHelloWorldOutput() {
        // Simulate running your program
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HelloWorld.main(new String[]{});

        // Check if the output is as expected
        assertEquals("Hello, World!\n", outContent.toString());
    }
}
