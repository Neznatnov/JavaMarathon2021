package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(11);
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Длина массива: " + numbers.length);

        int count8 = 0;
        int count1 = 0;
        int countEven = 0;
        int countOdd = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] >= 8) {
                count8++;
            }else if(numbers[i] == 1){
                count1++;
            }else if (numbers[i] % 2 == 0){
                countEven++;
            } else if (numbers[i] % 2 != 0){
                countOdd++;
            }
            sum += numbers[i];
        }

        System.out.println("Количество чисел больше 8: " + count8);
        System.out.println("Количество чисел равных 1: " + count1);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);

        /*int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 1) {
                count1++;
            }
        }

        System.out.println("Количество чисел равных 1: " + count1);
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            }
        }

        System.out.println("Количество четных чисел: " + countEven);

        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Количество нечетных чисел: " + countOdd);


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Сумма всех элементов массива: " + sum);*/
    }
}
