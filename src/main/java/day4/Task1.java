package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
1. С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера и заполнить его случайными числами от 0 до 10
 Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
Информация о массиве:
Длина массива: 10
Количество чисел больше 8: 1
Количество чисел равных 1: 0
Количество четных чисел: 6
Количество нечетных чисел: 4
Сумма всех элементов массива: 46
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // переменной присваивается число полученное через сканер
        int[] mass = new int[x];   // это число вводится как размер массива

        Random random = new Random(); // обект рандомное число  нужен для использования методов в классе рандом
        // Итерации цикла равны длинне массива
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);   // каждому элементу присваивается значение полученное в классе рандом ограниченое значением в атрибуте
        }
/*         for (int x_mass_random : mass) {
            x_mass_random = random.nextInt(10) ;    // почему не вышло с фор ич ?
    }
*/
        System.out.println("Информация о массиве:");
        // Вывод массива
        System.out.println(Arrays.toString(mass));
        System.out.println("Длина массива: " + mass.length);

        // Вычисление эл массива значение которых больше 8
        int eight_count = 0;           //создаем счетчик
        for (int x_eight : mass) {     // в цикле проходим массив с условием выбора и в случае соответствия увеличиваем счетчик на еденицу
            if (x_eight > 8)
                eight_count++;
        }
        System.out.println("Количество чисел больше 8: " + eight_count); // выводим значения счетчика для 8_рок
// ---------------------
        int one_count = 0;
        for (int x_one : mass) {
            if (x_one == 1)
                one_count++;
        }
        System.out.println("Количество чисел равных 1: " + one_count);
//------------------------
        int even_count = 0;
        for (int x_even : mass) {
            if (x_even % 2 == 0)
                even_count++;
        }
        System.out.println("Количестве четных чисел: " + even_count);
//------------------------
        int not_even_count = 0;
        for (int x_not_even : mass) {
            if (x_not_even % 2 != 0)
                not_even_count++;
        }
        System.out.println("Количество нечетных чисел: " + not_even_count);
//------------------------

        // Расчет суммы всех элементов
        int sum_el_mass = mass[0]; // изначально 0 элемент
        for (
                int x_next : mass) {  // для каждого элемента в массиве mass
            sum_el_mass += x_next; // первый элемент равен сумме самого себя и сдедующего элемента
        }
        System.out.println("Сумма всех элементов массива: " + sum_el_mass);

    }

}

