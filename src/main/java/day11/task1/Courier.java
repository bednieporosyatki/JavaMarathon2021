package day11.task1;

public class Courier implements Worker {
    Warehouse warehouse;
    private int salary = 0;
    private boolean isPayed = false;
    private int countC = 0;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.countDeliveryOrder();  // курьер считает  через счетчик в методе класса  и   ничего не выходит 0
        if (warehouse.getCountPickedOrders() >= 10000)
           bonus();

    }

    @Override
    public void bonus() {
        if (isPayed == true) {
            salary += 50000;
            System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");

    }


}