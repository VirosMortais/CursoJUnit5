package com.example.seccion4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, empleado 1, 1000",
            "2, empleado 2, 2000",
            "3, empleado 3, 3000"
    })
    void test1(long id, String name, Integer salary){
        System.out.println("id: " + id + ", name: " + name + ", salary: " + salary);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/users-data.csv", numLinesToSkip = 1)
    void test2(long id, String name, Integer salary){
        System.out.println("id: " + id + ", name: " + name + ", salary: " + salary);
    }

    enum Role{
        ADMIN, AUTHOR, ANONYMOUS
    }
    @ParameterizedTest
    @EnumSource(Role.class)
    void test3(Role role){
        System.out.println("Role: " + role);
    }

    @ParameterizedTest
    @MethodSource("namesProvider")
    void test4(String name){
        System.out.println("Name: " + name);
    }

    private static Stream<String> namesProvider(){
        return Stream.of("user 1", "user 2", "user 3");
    }
}
