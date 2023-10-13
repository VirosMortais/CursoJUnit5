package com.example.seccion3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class BConditionalTest {

   //JRE
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void test1() {
        System.out.println("Test 1 Java 8");
    }
    @EnabledOnJre(JRE.JAVA_16)
    @Test
    void test2() {
        System.out.println("Test 2 Java 16");
    }
    @EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_16)
    @Test
    void test3() {
        System.out.println("Test 3 Java 8 to 16");
    }

    //Sistema operativo

    @EnabledOnOs(OS.LINUX)
    @Test
    void test4() {
        System.out.println("Test 3 Java 8 to 16");
    }

    @Test
    void printEnv(){
        System.getenv().forEach(
                (k,v)->System.out.println(k+" : "+v)
        );

        System.getProperties().forEach(
                (k,v)->System.out.println(k+" : "+v)
        );
    }
}
