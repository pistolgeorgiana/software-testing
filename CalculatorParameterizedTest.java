package com.sda.unittesting.exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorParameterizedTest {

    //Given
    Calculator calculator = new Calculator();

    @ParameterizedTest
    @ValueSource(ints = {141, 208, 372})
    void testAddMethod(int first) {
        //When
        double result = calculator.add(first, 1);
        System.out.println(result);

        //Then
        assertEquals(first + 1, result);
    }

    @ParameterizedTest
    @MethodSource("getParameters") //ne folosim de o metoda care sa ne ofere parametri
            //@MethodSource primeste in paranteza numele metodei folosita pentru a primi parametri
    // void testAddWithParameters(int parametrul1, int parametrul2, .....) {
    void testAddWithParameters(int primulParametru, int alDoileaParametru, int rezultatAdunare) {
        System.out.println(primulParametru);
        System.out.println(alDoileaParametru);
        System.out.println(calculator.add(primulParametru, alDoileaParametru));

        double result = calculator.add(primulParametru, alDoileaParametru);
//        assertEquals(primulParametru + alDoileaParametru, result);
        assertEquals(rezultatAdunare, result);
    }

    public static Stream<Arguments> getParameters() {
        return Stream.of(Arguments.of(12, 1, 13),
                         Arguments.of(25, 23, 48));
    }

//    @ParameterizedTest
//    @MethodSource("provideAddParameters")
//    void testAddMethodUsingMethodSource(double first, double second, double expected) {
//        //When
//        double result = calculator.add(first, second);
//
//        //Then
//        assertEquals(expected, result);
//    }
//
//    static Stream<Arguments> provideAddParameters() {
//        return Stream.of(Arguments.of(12.0, 13.0, 25.0));
//    }
}
