package com.example.seccion4;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test para servicio SmartPhone")
public class ANestedTest {

    @Test
    @Disabled("TEST1")
    void test1() {
        System.out.println("Test 1");
        assertTrue(true);
    }

    @Nested
    @DisplayName("operaciones recuperar datos")
    class Group1{
        @Test
        @DisplayName("Find all()")
        void test2() {
            System.out.println("Test 2");
            assertTrue(true);
        }

        @Test
        @DisplayName("find one()")
        void test3() {
            System.out.println("Test 3");
            assertTrue(true);
        }


        @Test
        @DisplayName("find by CPU cores()")
        void test4() {
            System.out.println("Test 4");
            assertTrue(true);
        }
    }

    @Nested
    @DisplayName("operaciones insercion nuevos datos")
    class Group2{
        @Test
        @DisplayName("insert one()")
        void test5() {
            System.out.println("Test 5");
            assertTrue(true);
        }

        @Test
        @DisplayName("insert in batch()")
        void test6() {
            System.out.println("Test 6");
            assertTrue(true);
        }

        @Test
        @DisplayName("insert() with exception")
        void test7() {
            System.out.println("Test 7");
            assertTrue(true);
        }
    }
}
