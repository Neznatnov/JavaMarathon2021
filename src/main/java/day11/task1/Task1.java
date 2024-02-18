package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
    public static void main(String[] args) {


            Warehouse warehouse1 = new Warehouse();
            Picker picker1 = new Picker(0, warehouse1);
            Courier courier1 = new Courier(0, warehouse1);

            businessProcess(picker1);
            businessProcess(courier1);

        System.out.println("Warehouse 1:");
        System.out.println("Picked orders: " + warehouse1.getCountPickedOrders());
        System.out.println("Delivered orders: " + warehouse1.getCountDeliveredOrders());
        System.out.println("Picker's salary: " + picker1.getSalary());
        System.out.println("Courier's salary: " + courier1.getSalary());


            Warehouse warehouse2 = new Warehouse();
            Picker picker2 = new Picker(0, warehouse2);
            Courier courier2 = new Courier(0, warehouse2);


            picker2.doWork();
            courier2.doWork();

        System.out.println("Warehouse 2:");
        System.out.println("Picked orders: " + warehouse2.getCountPickedOrders());
        System.out.println("Delivered orders: " + warehouse2.getCountDeliveredOrders());
        System.out.println("Picker's salary: " + picker2.getSalary());
        System.out.println("Courier's salary: " + courier2.getSalary());
        }

    }
