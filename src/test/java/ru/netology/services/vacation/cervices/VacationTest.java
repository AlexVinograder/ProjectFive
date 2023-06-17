package ru.netology.services.vacation.cervices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationTest {
    @Test
    public void testThreeMonthsVacation() {
        Vacation service = new Vacation();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;


        int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoMonthsVacation() {
        Vacation service = new Vacation();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
