package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldAddProperly(){
        assertEquals(10, Main.calculateString("2/3;4;1+"));
    }
    @Test
    public void shouldSubtractProperly(){
        assertEquals(-32, Main.calculateString("2/3;4;15.6,2-"));
    }
    @Test
    public void shouldMultiplyProperly(){
        assertEquals(128, Main.calculateString("2/4;8;2*"));
    }
}