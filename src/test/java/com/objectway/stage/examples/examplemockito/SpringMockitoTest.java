package com.objectway.stage.examples.examplemockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
public class SpringMockitoTest {
    @Configuration
    static class Config {
        @Bean
        public RAM ram() {
            return new RAM();
        }

        @Bean
        public ALU alu() {
            return new ALU();
        }

        @Bean
        public Calculator calculator() {
            return new Calculator();
        }
    }

    @MockBean
    private RAM ram;

    @MockBean
    private ALU alu;

    /**
     * We can use the @MockBean to add mock objects to the Spring application context.
     * The mock will replace any existing bean of the same type in the application context.
     *
     * If no bean of the same type is defined, a new one will be added
     */
    @MockBean
    private Calculator calculator;

    @Test
    public void testMocks() {
        assertNotNull(calculator);
    }
}
