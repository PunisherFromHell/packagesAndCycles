package ru.netology.services;

public class RestService {
    public int calculateNumberOfMonths(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;

        for (int restMonth = 1; restMonth <= 12; restMonth++) {
            if (money >= threshold) {
                restMonths++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }

        }
        return restMonths;
    }
}