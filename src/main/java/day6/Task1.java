package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYerProduction(2020);
        car.setColor("Красный");
        car.setModel("Kia");

        Motorbike motorbike = new Motorbike(2010, "Синий", "Иж");

        car.info();
        System.out.println("Разница " + car.yearDifference(2010));

        motorbike.info();
        System.out.println("Разница " + motorbike.yearDifference(2020));
    }
}
