package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1976, 30, 35, 0);

        airplane1.fillUp(10);
        airplane1.fillUp(20);
        airplane1.info();

    }

}
