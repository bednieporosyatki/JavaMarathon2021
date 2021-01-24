package day5;

/*
1. Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”. Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль. Задать значение для каждого поля, используя set методы. Вывести в консоль значение каждого из полей, используя get методы.
Созданный вами класс должен отвечать принципам инкапсуляции.

* */
public class Task1 {
    public static void main(String[] args) {

        Car car = new Car();
        car.setYerProduction(2013);
        car.setColor("Красный");
        car.setModel("Kia");

        System.out.println("Модель машины " + car.getModel() + " \nЦвет " + car.getColor() + " \nГодв ыпуска " + car.getYearProduction());

    }
}
