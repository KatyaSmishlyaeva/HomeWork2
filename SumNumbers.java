package com.itacademy;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую сумму цифр введённого
 * пользователем целого числа.
 */
public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = sum(number);
        System.out.println("Сумма цифр числа " + number + " = " + sum);
    }

    public static int sum(int value) {
        int sum = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            sum += currentValue % 10;
        }
        return sum;
    }

}
