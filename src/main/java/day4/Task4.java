package day4;

import java.util.Arrays;
import java.util.Random;

/*
4. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с максимальной суммой выведите
значение суммы и индекс первого элемента тройки.
Пример:
*Для простоты пример показан на массиве размера 10
[1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

Тройка с максимальной суммой: [8742, 1040, 3254]

Вывод в консоль:
130367
*Пояснение. Первое число - сумма тройки [8742, 1040, 3254].
Второе число - индекс первого элемента тройки, то есть индекс числа 8742.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] mass =new int[100];
        Random random = new Random();
        for (int i = 0; i <mass.length ; i++) {
            mass[i]=random.nextInt(1000);
            Arrays.sort(mass);
        }

        System.out.println(Arrays.toString(mass));

    }
}
/*
Random rand = new Random();

        int[] myMass = new int[100];

        int sumChisel = 0, maxSum = 0, indexStroki = 0;

        for (int i = 0; i < myMass.length; i++) {
            myMass[i] = rand.nextInt(10000);
            //System.out.print(moiMassiv[i] + "\t");
        }

        System.out.println();

        for (int k = 0; k < myMass.length - 2; k++) {
            sumChisel = myMass[k] + myMass[k + 1] + myMass[k + 2];
            if(sumChisel>maxSum){
                maxSum = sumChisel;
                indexStroki = k;
            }
            //System.out.print(moiMassiv[k] + " ");
            //System.out.print(moiMassiv[k + 1] + " ");
            //System.out.print(moiMassiv[k + 2] + "\t");
            //System.out.println(sumChisel);
        }
        System.out.println("Максимальное значение - " + maxSum);
        System.out.println("А вот это его индекс - " + indexStroki);
        System.out.println();
        System.out.println("Проверено, что считает правильно");
    }
* */