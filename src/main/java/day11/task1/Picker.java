package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public Picker(double salary, Warehouse warehouse) {
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
        salary += 80;
        warehouse.incrementPickedOrders();

    }

    @Override
    public void bonus() {
        if (!isPayed && warehouse.getCountPickedOrders() >= 10000) {
            salary += 70000;
            isPayed = true;
        } else {
            System.out.println("Bonus has already been paid");
        }
    }


    @Override
    public String toString() {
        return "Salary= " + salary +
                ", Bonus" + isPayed;
    }


}

