package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        double redPerimeterSum = calculateRedPerimeter(figures);
        System.out.println(redPerimeterSum);

        double redAriaSum = calculateRedArea(figures);
        System.out.println(redAriaSum);

    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double redPerimeterSum = 0.0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                redPerimeterSum += figure.perimeter();
            }
        }
        return redPerimeterSum;


    }

    public static double calculateRedArea(Figure[] figures) {
        double redAreaSum = 0.0;
        for (Figure figure : figures) {
            if ("Red".equals(figure.getColor())) {
                redAreaSum += figure.area();
            }
        }
        return redAreaSum;
    }


}
