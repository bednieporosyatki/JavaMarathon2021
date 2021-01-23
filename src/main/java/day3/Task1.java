package day3;
/*1. Реализовать программу, которая в консоль выводит название страны, принимая на вход название города. Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия
Рим, Милан, Турин - Италия
Ливерпуль, Манчестер, Лондон - Англия
Берлин, Мюнхен, Кёльн - Германия

При вводе любого другого города, вывести сообщение “Неизвестная страна”.

Пример:
Милан - ваш ввод в консоль
Италия - ответ программы
Дублин - ваш ввод в консоль
Неизвестная страна - ответ программы
Stop - ваш ввод в консоль
*программа завершила работу*
*/

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
//NB     Под моим решением  Есть правильное!
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;   //  задаю булевскую переменную
        while (stop) {         // пока true - выполняй!
            String find = scanner.nextLine();
            switch (find) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Милан":
                case "Турин":
                case "Рим":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    System.out.println("*программа завершила работу*");
                    stop = false;      //  остановка цикла т.к. при этом варианте меняется значение условия цикла  (в условии true)
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
        }
        System.out.println("Вышел из вайл!"  );



 // NB!!  ПРАВИЛЬНОЕ РЕШЕНИЕ   - поставить первым местом условия выхода, а далее спускаться по свитчу

        Scanner scaner = new Scanner(System.in);
        while (true) {
            String x = scaner.nextLine();// не понимаю почему эта строчка вне цикла делает бесконечный вывод

            if(x.equals("Stop")) //- сразу после сканера  проверяем  ключевое слово выхода
                break;            // если оно не введено   проваливаемся дальше

            switch (x) {

                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Тури":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                   break;

                default:
                    System.out.println("Неизвестная страна");

            }

        }





    }
}

