package day4;

import java.util.Arrays;
import java.util.Random;

/*
3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер матрицы задать m=12, n=8
(m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна.
 Если таких строк несколько, вывести индекс последней из них.

Пример сгенерированной матрицы (для простоты m=3, n=5):
3 2 1 5 7 	// сумма - 18
1 2 5 6 2 	// сумма - 16
3 4 9 6 4	// сумма - 26

 */
public class Task3 {   // Решение Наиля  показывает недостаток упражнений с массивами и вложенными циклами
    public static void main(String[] args) {
// создание массива и наполнение его  рандомными значениями
        int[][] mas = new int[12][8];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                Random random = new Random();
                mas[i][j] = random.nextInt(50);
                System.out.print(mas[i][j] + "\t "); // выводим массив
            }
            System.out.println();
        }
//----------------------

        int maxSum = 0;
        int maxSumIndex = 0;

        for (int i = 0; i < mas.length; i++) {    //  длинна массива
            int sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
            }
            if (sum >= maxSum) {  // >= позволяет записать не первое найденнное значение а последнее максимальное
                maxSum = sum;
                maxSumIndex = i;

            }
        }
        System.out.println("Индекс строки с последней максимальной цифрой " + maxSumIndex);

    }
}

