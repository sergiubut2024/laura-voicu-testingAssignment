// Path: /src/main/java/com/example/Converter.java
package com.example;

public class Converter {

    public static int toMillimeters(int value, String unit) {
        switch (unit) {
            case "mm": return value;
            case "cm": return value * 10;
            case "dm": return value * 100;
            case "m": return value * 1000;
            case "km": return value * 1000000;
            default: throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }
}
