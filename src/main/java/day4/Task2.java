package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Максимальное значение: " + max);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Минимальное значение: " + min);

        int count0 = 0;
        for (int num : numbers) {
            if (num % 10 == 0) {
                count0++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);

        int countSum = 0;
        for (int num : numbers) {
            if (num % 10 == 0) {
                countSum = num + countSum;
            }
        }
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + countSum);
    }
}
