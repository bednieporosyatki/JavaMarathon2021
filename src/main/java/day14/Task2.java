package day14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Создать в папке проекта файл people.txt в котором хранятся имена и возраст людей.
* Реализовать статический метод List<String> parseFileToStringList(File file), который считывает содержимое этого файла
  и возвращает список, состоящий из значений имен и возрастов каждого человека.
* Получить данный список в методе main() и распечатать его в консоль.
* В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и
  выводить в консоль сообщение “Файл не найден”.
* Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение,
  выводить в консоль сообщение “Некорректный входной файл” и возвращать null или пустой список.

Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5]
*
Пример содержания файла people.txt:
Mike 24
John 19
Anna 20
Miguel 5
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");        // создаем объект класса файл и  передаем ему путь к файлу
        List<String> people = new ArrayList<>();              //   создаем коллекцию в которую будем добавлять людей  и  возвращать в методе
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();               // содержание 1 строки =  1 строки где   есть  текст им и возраст
                String[] person = line.split(" ");        // создаем массив  в котором разделяем строку line на 2 элемента  ([0]имя/[1]возраст)

                if (Integer.parseInt(person[1]) < 0)           // проверяем [1] элемент массива  person (возраст)  если меньше 0 то выбрасываем исключение
                    throw new IllegalArgumentException();      // исключение  некорректный файл // в случае  если файл корректен продолжает работу

                people.add(line);                              //  Добавляем строки в коллекцию
            }
            return people;                                      // возвращаем коллекцию

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;                                           //  если программа словила исключения   то  результатом  выдаем нулл (ничего)
    }


}





