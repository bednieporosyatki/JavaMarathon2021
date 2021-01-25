package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("Tu", 1990, 20, 3000, 0);
        airplane.setYear(2000);
        airplane.setLength(30);
        airplane.fillUp(10000);
        airplane.info();

    }
}
