package com.objectway.stage.examples.examplemockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class CalculatorWithAnnotationsTest {
    @Mock
    private Calculator calculator;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMocks() {
        Mockito.when(calculator.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);

        assertEquals("Math is an opinion", 5, calculator.sum(2, 2));

        Mockito.verify(calculator).sum(2, 2);
    }
}
