package ru.netology.JavaQAMaven.JavaDZ6_1.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.JavaQAMaven.JavaDZ6_1.services.NumberMonthsRest;

public class NumberMonthsRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/months.csv")
    public void testExampleFromAssignment(int expected, int income, int expenses, int threshold) {
        NumberMonthsRest service = new NumberMonthsRest();

//        // Входные данные
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2; // ожидаемый результат
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testExample() {
//        NumberMonthsRest service = new NumberMonthsRest();
//
//        // Входные данные
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 3; // ожидаемый результат
//        int actual = service.calculate(income,expenses,threshold);
//        Assertions.assertEquals(expected,actual);
//    }
}
