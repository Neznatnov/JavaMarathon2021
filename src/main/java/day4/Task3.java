package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int matrix[][] = new int[12][8];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int maxSum = 0;
        int rowIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum = rowSum + matrix[i][j];
            }
            System.out.println(rowSum);
            if (maxSum <= rowSum) {
                maxSum = rowSum;
                rowIndex = i;

            }
        }
        System.out.println(rowIndex);
    }
}
