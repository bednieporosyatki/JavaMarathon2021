package day4;

import java.util.Arrays;
import java.util.Random;

/*
2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести в консоль:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.

 */
public class Task2 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        Random random = new Random();  // обект рандомное число  нужен для использования методов в классе рандом
        // Итерации цикла равны длинне массива
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(1000);   // рандомные в диапазоне 1000
        }

        System.out.println(Arrays.toString(mass));
        //наибольший элемент массива
        int max = 0;
        for (int x : mass) {
            if (x > max) {
                max = x;

            }
        }
        System.out.println("наибольший элемент массива " + max);

        int min = 1000;
        for (int x : mass) {
            if (x < min) {
                min = x;

            }
        }
        System.out.println("наименьший элемент массива " + min);
        // сумма элементов делящихся на 0 и сумму этих элементов
        int nul_counter = 0;
        int nulSum = 0;
        for (int x_mas : mass) {
            if (x_mas % 10 == 0) {
                nul_counter++; // увеличиваем счетчик
                nulSum += x_mas;
            }

        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + nul_counter + "\nСумма эл/0 :" + nulSum);


    }
}

