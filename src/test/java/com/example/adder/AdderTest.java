package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void addTwoNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }
}
