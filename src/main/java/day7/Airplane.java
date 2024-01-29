package day7;

public class Airplane {
    private final String manufacturer;
    private final int year;
    private final int length;
    private final int weight;
    private int fuel;


    public Airplane(String manufacturer, int year, int length, int weight, int fuel) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длина самолетов равна");
        }

    }

    public int getFuel() {
        return fuel;
    }

    public int getLength() {
        return length;
    }

    public void fillUp(int n) {
        fuel += n;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);

    }
}
