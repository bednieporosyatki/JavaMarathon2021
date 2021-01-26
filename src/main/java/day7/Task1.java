package day7;

/*
* 1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том, какой из самолетов длиннее.*/
public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("TU", 1990, 55, 20000);
        Airplane air2 = new Airplane("Boeng", 2020, 45, 30000);

        Airplane.compareAirplanes(air1, air2); //вытаскиваем статический метод через его класc.

    }
}