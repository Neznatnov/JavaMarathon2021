package day11.task1;

public class Courier implements Worker {

    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(double salary, Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.incrementDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (!isPayed && warehouse.getCountDeliveredOrders() >= 10000) {
            salary += 50000;
            isPayed = true;
        } else {
            System.out.println("Bonus has already been paid");
        }

    }
    @Override
    public String toString() {
        return "Salary=" + salary +
                ", Bonus" + isPayed;
    }

}
