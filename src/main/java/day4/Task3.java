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
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[12][8];

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 8; j++) {
                mas[i][j] = random.nextInt(50);  //  Заполняем рандомными цифрами оба массива
            }
        }
        //--------------------------------------------------
        int sum_chisel = 0;
        int max_sum = 0;
        int str = 0;
        int index=0;
        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 8; j++) {
                sum_chisel = sum_chisel + mas[i][j]; // сумме чисел
                System.out.print(mas[i][j] + " ");
                str = i;
            }
            System.out.print("сумма : " + sum_chisel);

            if (sum_chisel > max_sum) {
                max_sum = sum_chisel;
                index=str;
            }
            sum_chisel = 0;
            System.out.println();
        }
        System.out.println();
        System.out.println("Индекс строки " + index + "," + " Максимальная сумма = " + max_sum);

    }
}
