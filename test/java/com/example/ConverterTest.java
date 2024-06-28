// Path: /src/test/java/com/example/ConverterTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {

    @Test
    public void testConversionToMillimeters() {
        assertEquals(10, Converter.toMillimeters(10, "mm"));
        assertEquals(100, Converter.toMillimeters(10, "cm"));
        assertEquals(1000, Converter.toMillimeters(10, "dm"));
        assertEquals(10000, Converter.toMillimeters(10, "m"));
        assertEquals(10000000, Converter.toMillimeters(10, "km"));
    }
}
