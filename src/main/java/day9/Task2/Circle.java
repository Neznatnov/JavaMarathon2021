package day9.Task2;

public /*abstract*/ class Circle extends Figure {

    private final int circleRadius;

    public Circle(String color, int circleRadius) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * circleRadius * circleRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI;
    }

}
