package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(1980, "Синий", "Иж");

        System.out.println("Модель мотоцикла " + motorbike.getModel() + " \nЦвет " + motorbike.getColor() + " \nГодв ыпуска " + motorbike.getYearProduction());

    }
}
