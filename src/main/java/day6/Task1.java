package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYerProduction(1990);
        car.setColor("Красный");
        car.setModel("Kia");

        Motorbike motorbike = new Motorbike(1980, "Синий", "Иж");
        car.info(2000);
        motorbike.info(2000);
    }
}
