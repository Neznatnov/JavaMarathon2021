package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Kawasaki", "Red", 2002);
        System.out.println("Марка мотоцикла: " + motorbike1.getModel());
        System.out.println("Цвет мотоцикла: " + motorbike1.getColor());
        System.out.println("Год выпуска мотоцикла: " + motorbike1.getProductionYear());
    }
}
