package ru.netology.JavaQAMaven.JavaDZ6_1.services;

public class NumberMonthsRest {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // кол-во месяцев отдыха
        int money = 0; // кол-во денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли мы отдыхать?
                count++;
                money = money - expenses;
                money = money / 3;
            } else {
                money = money + income - expenses;
            }
        }

        return count;
    }
}
