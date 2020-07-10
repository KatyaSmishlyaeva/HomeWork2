package com.itacademy;

import java.util.Scanner;

/**
 * Написать программу, отображающую статистику по осадкам
 * за N дней. N вводится пользователем.
 *     Пользователь также должен ввести N целых чисел, обозначающих
 * величину осадков в день.
 *     Программа должна выводить:
 * a. Количество дней
 * b. Сумму осадков за этот период
 * c. Среднее количество осадков за этот период
 * d. Максимальное количество дневных осадков за этот период
 */
public class Rainfall {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во дней: ");
        int numberOfDays = scanner.nextInt();

        statisticsRainfall(numberOfDays);
    }

    public static double averageRainfall(int days, int sum) {
        return (double) sum / days;
    }

    public static void statisticsRainfall(int numberOfDays) {
        int sumRainfall = 0;
        int maxRainfall = Integer.MIN_VALUE;
        for (int dayNumber = 1; dayNumber <= numberOfDays; dayNumber++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите кол-во осадков в " + dayNumber + " день: ");
            int rainfall = scanner.nextInt();
            sumRainfall += rainfall;
            if (rainfall > maxRainfall) {
                maxRainfall = rainfall;
            }
        }
        System.out.println("Количество дней: " + numberOfDays);
        System.out.println("Сумму осадков за этот период: " + sumRainfall);
        System.out.println("Среднее количество осадков за этот период: " + averageRainfall(numberOfDays, sumRainfall));
        System.out.println("Максимальное количество дневных осадков за этот период: " + maxRainfall);
    }

}


