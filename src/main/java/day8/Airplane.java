package day8;

public class Airplane {
    private final String manufacturer;
    private final int year;
    private final int length;
    private final int weight;


    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String toString() {
        return manufacturer + ", " + year + ", " + length + ", " + weight;
    }

}
