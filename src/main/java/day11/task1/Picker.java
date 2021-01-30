package day11.task1;

public class Picker implements Worker {
    Warehouse warehouse;
    private int salary = 0;
    private boolean isPayed = false;
    private int bonus = 70000;
    private int countP = 0;

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Picker{" + "salary=" + salary + ", isPayed=" + isPayed + '}';
    }


//    @Override
//    public void doWork() {
//        salary += 80;
//          countP++;
//        warehouse.setCountPickedOrders(countP);
//        if (warehouse.getCountPickedOrders() >= 10000)
//            isPayed = true;
//    }
////  при этом варианте  и у курьера бонус зачисляется...   В общем  здесь все неправильно скорее всего
//    @Override
//    public void bonus() {
//        if (isPayed == true) {
//            salary += bonus;
//            System.out.println("Бонус уже был выплачен");
//        } else System.out.println("Бонус пока не доступен");
//    }

    @Override
    public void doWork() {
        salary += 80;

        // вот выдержка из задания "Сотрудникам полагается бонус, в зависимости от персональных показателей: когда на складе собрано 10.000 заказов,"
        // ключевое слово    "персональных"


        warehouse.countPickOrder();                     //  Не отрабатывает метод со счетчиком - почему?
        if (warehouse.getCountPickedOrders() >= 10000)    // если счетчик  больше или равен 10 000
            isPayed = true;                               // меняется статус на тру
    }

    @Override
    public void bonus() {
        if (isPayed == true) {                          //  при вызове метода бонус  метод смотрит переменную  если она фолс  значит  нет бонусов
            salary += bonus;                             //   если тру   то  к зарплате  прибавляем  бонус (70 000 )
            System.out.println("Бонус уже был выплачен");
        } else System.out.println("Бонус пока не доступен");
    }

    public Picker(Warehouse warehoused) {
        this.warehouse = warehoused;
    }
}
