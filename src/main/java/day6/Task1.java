package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Motorbike motorbike1 = new Motorbike("honda", "red", 2003);
        car1.setModel("Skoda");
        car1.setColor("white");
        car1.setProductionYear(1995);

        car1.info();
        System.out.println(car1.yearDifference(2021));

        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2026));

    }
}
