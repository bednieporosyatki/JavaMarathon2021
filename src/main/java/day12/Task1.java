package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
1. Создать список строк, добавить в него 5 марок автомобилей,
вывести список в консоль. Добавить в середину еще 1 автомобиль,
удалить самый первый автомобиль из списка. Вывести список в консоль.
* */
public class Task1 {


    public static void main(String[] args) {
        // -------  укороченное наполнение  коллекции ----------
        //  List<String> auto = new ArrayList<>();    // создание коллекции
        //  Arrays.asList("VAZ", "BMW", "KIA", "VOLGA", "GMC"); // наполнение

        List<String> auto = new ArrayList<>(Arrays.asList("VAZ", "BMW", "KIA", "VOLGA", "GMC")); // создаем и наполняем коллекцию (укороченный вариант)
        System.out.println(auto);
        auto.add(3, "Tesla");
        auto.remove(0);
        System.out.println(auto);


// ------------------ как работал с коллекциями раньше---------------------
//        List<String> cars = new ArrayList<>(); // создаем коллекцию стрингов
//        cars.add("Vaz1");  // наполняем
//        cars.add("BMW1");
//        cars.add("KIA1");
//        cars.add("VOLGA1");
//        cars.add("GMC1");
//
//        System.out.println(cars); // выводим коллекцию в консоль
//
//        cars.add(3,"Tesla"); // добавляем на  место 3го элемента новое значениес
//        cars.remove(0); // удалить первый элемент
//        System.out.println(cars);

    }
}




