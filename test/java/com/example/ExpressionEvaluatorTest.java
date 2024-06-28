// Path: /src/test/java/com/example/ExpressionEvaluatorTest.java
package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class ExpressionEvaluatorTest {

    @Test
    public void testEvaluateExpression() {
        assertEquals(1090, ExpressionEvaluator.evaluate("10 cm + 1 m - 10 mm"));
        assertEquals(2000, ExpressionEvaluator.evaluate("2 m"));
        assertEquals(1000, ExpressionEvaluator.evaluate("1 km - 999 m"));
    }

    @ParameterizedTest
    @CsvSource({
        "10 cm + 1 m - 10 mm, 1090",
        "2 m, 2000",
        "1 km - 999 m, 1000"
    })
    public void testEvaluateExpressionParameterized(String expression, int expected) {
        assertEquals(expected, ExpressionEvaluator.evaluate(expression));
    }
}
