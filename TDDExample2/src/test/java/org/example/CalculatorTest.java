package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class CalculatorTest {


    // B211202003
    // Emirhan Tuygun
    // SWE 202 - SVV - Homework 1
    // https://github.com/emirhantuygun/SVV_Homework_1


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/csv/data.csv", numLinesToSkip = 1)
    void divide_ShouldResultTheExpectedFloatValueCSVFile(
            float a, float b, float expected) {
        assertEquals(expected, Calculator.divide(a,b));
    }

}