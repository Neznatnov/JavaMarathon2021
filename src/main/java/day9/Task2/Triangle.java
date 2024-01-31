package day9.Task2;

public class Triangle extends Figure {

    private final int lengthA;
    private final int lengthB;
    private final int lengthC;

    public Triangle(String color, int lengthA, int lengthB, int lengthC) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double s = (lengthA + lengthB + lengthC) / 2;
        return Math.sqrt(s * (s - lengthA) * (s - lengthB) * (s - lengthC));
    }

    @Override
    public double perimeter() {
        return lengthA + lengthB + lengthC;
    }

}
