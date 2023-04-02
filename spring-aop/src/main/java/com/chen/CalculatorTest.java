package com.chen;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = SpringConfiguration.class)
public class CalculatorTest {
    @Autowired
    private Calculator calculator;
    @Test
    public void test(){
        calculator.add(1,2);
    }
}
