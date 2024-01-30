package day8;

public class Task1 {
    public static void main(String[] args) {

        String numbers1 = "";
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            numbers1 += i + " ";
        }
        System.out.println(numbers1);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));


        long startTime2 = System.currentTimeMillis();
        StringBuilder numbers2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            numbers2.append(i);
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));


    }
}
