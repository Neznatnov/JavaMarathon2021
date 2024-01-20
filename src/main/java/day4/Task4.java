package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        Random rand = new Random();
        int [] numbers = new int [100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        int index = 0;

        for (int i = 0; i < numbers.length - 2; i++) {
          int sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum > max){
                max = sum;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
