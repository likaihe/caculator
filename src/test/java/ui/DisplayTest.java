package ui;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.TestUtil.randomDouble;

class DisplayTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Display display;

    @BeforeEach
    void setUp() {
        display = new Display();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void showOutput() {
        final double result = randomDouble();

        //When
        display.showOutput(result);
        //Then
        assertEquals(Double.toString(result), outputStreamCaptor.toString()
                .trim());
    }
}
