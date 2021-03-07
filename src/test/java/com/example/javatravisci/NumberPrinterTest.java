package com.example.javatravisci;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NumberPrinterTest {

    private NumberPrinter numberPrinter = new NumberPrinter();
    private static final PrintStream stdout = System.out;
    private static final ByteArrayOutputStream output = new ByteArrayOutputStream();


    @BeforeClass
    public static void init() {
        System.setOut(new PrintStream(output));
    }

    @AfterClass
    public static void tearDown() {
        System.setOut(stdout);
    }

    @Test
    public void testPrintNumbers() {
        //Given
        String expectedOutput = "1\n2\n3\n4\n5\n6\n7\n9\n10";

        //When
        numberPrinter.printNumbers();

        //Then
        assertEquals(expectedOutput, output.toString().trim());
    }

}