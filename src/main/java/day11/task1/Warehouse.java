package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

//    public Warehouse(int countPickedOrders, int countDeliveredOrders) {
//        this.countPickedOrders = countPickedOrders;;
//        this.countDeliveredOrders = countDeliveredOrders;;
//    }
    public Warehouse() {
        this.countPickedOrders = 0;
        this.countDeliveredOrders = 0;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "countPickedOrders= " + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders;
    }
public void incrementPickedOrders(){
     countPickedOrders++;
}
    public void incrementDeliveredOrders() {
        countDeliveredOrders++;
    }

}
