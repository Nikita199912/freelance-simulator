package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    void shouldCalculateVacations(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);
    }
}