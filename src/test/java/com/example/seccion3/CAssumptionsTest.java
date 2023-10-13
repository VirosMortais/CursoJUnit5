package com.example.seccion3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;


public class CAssumptionsTest {

    @BeforeAll
    static void setUp(){
        System.getenv().forEach(
                (k,v)->System.out.println(k+" : "+v)
        );

        System.getProperties().forEach(
                (k,v)->System.out.println(k+" : "+v)
        );
    }

    @Test
    @DisplayName("Comprueba el JDK")
    void test1() {
        String jdk = System.getenv("JAVA_HOME");
        assumeTrue(jdk.contains("jdk-20"));
        assumeFalse(jdk.contains("jdk-11"));

        System.out.println("El test continua");
    }

    @Test
    @DisplayName("Comprueba el JDK con assumingThat")
    void test2() {
        String jdk = System.getenv("JAVA_HOME");
        assumingThat(jdk.contains("jdk-20"),
                ()-> {
                    System.out.println("El test continua");
                }
        );
    }
}
