package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Random rand = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        int index = 0;
        int groupSize = 3;
        for (int i = 0; i < numbers.length - groupSize + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + groupSize; j++) {
                sum += numbers[j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }


        System.out.println(max);
        System.out.println(index);

    }
}
