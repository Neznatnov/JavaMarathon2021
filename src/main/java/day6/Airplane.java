package day6;

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

    public int getFuel() {
        return fuel;
    }

    public void fillUp(int n) {
        fuel += n;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);

    }
}
