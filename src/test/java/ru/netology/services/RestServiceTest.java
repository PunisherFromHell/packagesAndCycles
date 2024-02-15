package ru.netology.services;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestServiceTest {
    @Test
    public void testCalculateNumberOfMonths() {
        RestService restService = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedRestMonths = 2;
        int actualRestMonths =
                restService.calculateNumberOfMonths(income, expenses, threshold);
        Assert.assertEquals(expectedRestMonths, actualRestMonths);


    }

}
