package com.objectway.stage.examples.examplemockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ALUTest {
    @Mock
    private ALU alu;

    @Mock
    private RAM ram;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void testMocks() {
        Mockito.when(alu.sum(Mockito.anyInt(), Mockito.anyInt())).thenReturn(5);

        // Partial mocking
        Mockito.doCallRealMethod().when(ram).store(Mockito.anyInt());
        Mockito.doCallRealMethod().when(ram).getValue();

        assertEquals("Math is an opinion", 5, calculator.sum(2, 2));
        assertEquals("Math is an opinion", 5, calculator.getLastResult());

        Mockito.verify(alu).sum(2, 2);
        Mockito.verify(ram).store(5);
        Mockito.verify(ram).getValue();
    }
}
