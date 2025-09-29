package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int vacations = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                vacations++;
                money = (money - expenses) / 3; // после расходов на быт остаток делится на 3
            } else {
                money = money + income - expenses; // рабочий месяц
            }
        }
        return vacations;
    }
}