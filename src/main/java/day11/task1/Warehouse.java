package day11.task1;

public class Warehouse implements Worker {
    private int countPickedOrders;
    private int countDeliveredOrders;

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


    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }

    public void countPickOrder() {   // Мы создаем  метод увеличивающий счетчик сборок (общий)
        countPickedOrders++;
    }

    public void countDeliveryOrder() {   // Мы создаем  метод увеличивающий счетчик доставок (общий)
        countDeliveredOrders++;
    }


}
