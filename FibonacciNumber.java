package com.itacademy;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую и отображающую все числа
 * Фибоначчи меньше введённого пользователем целого числа.
 * последовательность Фибоначчи выглядит так:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 и так далее.
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int value = scanner.nextInt();

        fibonachi(value);
    }

    public static void fibonachi(int number) {
        int result = 0;
        for (int firstNumber = 0, secondNumber = 1; firstNumber < number; firstNumber = secondNumber, secondNumber = result) {
            System.out.print(firstNumber + " ");
            result = firstNumber + secondNumber;
        }

    }
}
