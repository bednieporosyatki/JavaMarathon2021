package day11.task1;

public class Warehouse implements Worker {
    private int countPickedOrders;
    private int countDeliveredOrders;
    private int countPickOrder = 0;     // создаем переменные счетчика
    private int countDeliveryOrder = 0;

    @Override
    public String toString() {
        return "Warehouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }


    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }

    public void countPickOrder() {   // Мы создаем  метод увеличивающий счетчик сборок (общий)
        countPickOrder++;
    }

    public void countDeliveryOrder() {   // Мы создаем  метод увеличивающий счетчик доставок (общий)
        countPickOrder++;
    }


}
