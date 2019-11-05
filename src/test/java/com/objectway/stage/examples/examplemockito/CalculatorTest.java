package com.objectway.stage.examples.examplemockito;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testMocks() {
        final Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);

        assertEquals("Math is an opinion", 5, calculator.sum(2, 2));

        Mockito.verify(calculator).sum(2, 2);
    }
}
