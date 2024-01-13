package ru.netology.javaqa.JavaHW5.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0;
        int money = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                months++;
                money -= expenses;
                money = money / 3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return months;

    }
}
