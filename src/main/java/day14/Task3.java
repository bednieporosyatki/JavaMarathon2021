package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
3. Создать класс “Человек” с полями “имя” и “возраст”.
Реализовать статический метод List<Person> parseFileToObjList(File file), который считывает содержимое того же файла people.txt,
создает экземпляры класса “Человек” и возвращает список объектов. Получить данный список в методе main() и распечатать его в консоль.
В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.

Пример ответа: [{name='Mike', year=24}, {name='John', year=19}, {name='Anna', year=20}, {name='Miguel', year=5}]

* */
// писал сам  без подглядок на уроки (надо  будет поиграться с   большим колличеством значений  чтиобы осознать как выдергивается  информация из массива  )
public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt"); //  создаем объект файл указвем путь
        System.out.println(parseFileToObjList(file));      // вызываем статический метод  для проверки кода

    }

    public static List<Person> parseFileToObjList(File file) {  // в метод передаем экземпляр класса файл
        List<Person> personList = new ArrayList<>();            //  создаем  коллекцию, которую будем наполнять и возвращать
        try {
            Scanner scanner = new Scanner(file);                // сканер с атрибутом файл
            while (scanner.hasNextLine()) {                      // цикл с условием "пока сканет видит строки - делай"
                String line = scanner.nextLine();                // создаем переменную в которую вносим  строку целиком
                String[] lineMas = line.split(" ");         // создаем массив и разбиваем строку по  пробелу (в строке 2 значения  имя и возраст)
                int year = Integer.parseInt(lineMas[1]);          // создаем переменную  типа  int  и   записываем в нее значение массива в 2 элементе

                if (Integer.parseInt(lineMas[1]) < 0) {        // проверка на то, что возраст больше 0
                    throw new IllegalArgumentException();    // если проверка не проходит создается исключение
                }

                Person person = new Person(lineMas[0], year);      // создаем объект человек и в конструктор подставляем в имя первый элемент массива [o] а в возраст  переменную age  полученную при парсинге 2го  [1] элемента
                personList.add(person);                           // добавляем  в коллекцию полученного  элемента
            }
            return personList;                                    //  возвращаем коллекцию  если  не словили эксепшены

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}
