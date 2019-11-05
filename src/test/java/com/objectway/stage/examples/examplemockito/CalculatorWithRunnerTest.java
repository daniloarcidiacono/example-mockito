package com.objectway.stage.examples.examplemockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorWithRunnerTest {
    @Mock
    private Calculator calculator;

    @Test
    public void testMocks() {
        Mockito.when(calculator.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);

        assertEquals("Math is an opinion", 5, calculator.sum(2, 2));

        Mockito.verify(calculator).sum(2, 2);
    }

    @Test
    public void testDoAnswer() {
        Mockito.doAnswer((InvocationOnMock invocation) -> {
            Integer arg0 = invocation.getArgument(0);
            Integer arg1 = invocation.getArgument(1);

            return arg0 * arg1;
        }).when(calculator).sum(Mockito.any(Integer.class), Mockito.any(Integer.class));

        assertEquals("Multiply instead of add", 20, calculator.sum(4, 5));
    }
}
