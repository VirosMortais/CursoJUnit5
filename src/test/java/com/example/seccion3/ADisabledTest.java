package com.example.seccion3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ADisabledTest {

    @Test
    @Disabled("Disabled until bug #999 has been fixed")
    void test1() {
        System.out.println("test1");
        assertTrue(true);
    }

    @Test
    @Disabled("Disabled until bug #99 has been fixed")
    void test2() {
        System.out.println("test2");
        assertTrue(true);
    }
}
