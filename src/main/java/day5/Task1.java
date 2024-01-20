package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.setModel("Skoda");
    car1.setColor("white");
    car1.setProductionYear(1995);
        System.out.println("Марка автомобиля: " + car1.getModel());
        System.out.println("Цвет автомобиля: " + car1.getColor());
        System.out.println("Год выпуска автомобиля: " + car1.getProductionYear());
    }
}
