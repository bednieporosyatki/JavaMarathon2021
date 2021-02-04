package day14;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/*

1. Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
Заполнить его вручную десятью произвольными числами. Реализовать статический метод printSumDigits(File file),
который считает сумму всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
Помимо этого, если чисел в файле меньше или больше 10,
необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
Вызвать данный метод в методе main().

* */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");

        printSumDigits(file);

    }


    public static void printSumDigits(File file) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(file);

            String num = scanner.nextLine();   // считываем строку
            String[] numMas = num.split(" ");
            System.out.println(Arrays.toString(numMas)); //  выводим массив там пока строки

//----проверка условия что значений  разделенных пробелами 10 (можно с помощью матчер и регулярного выраажения проверять являются ли значения цифрами)
            if (numMas.length != 10) {
                /// System.out.println("Некорректный входной файл"); можем вывести сообщение  или ...
                throw new IllegalArgumentException();  // обработка исключения  "неправильно поданные аргументы"
            }
            int sum = 0; // заводим переменную в которой будет храниться сумма чисел
// ------в цикле
            for (String number : numMas) {
                sum += Integer.parseInt(number);  // переводим значения из строковой в цифровую и прибавляем это к сумме
            }


            System.out.println(sum);  // выводим сумму


        } catch (FileNotFoundException e) {
            System.out.println("Файл не  найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл (из блока кетч)");
        }
    }

}
