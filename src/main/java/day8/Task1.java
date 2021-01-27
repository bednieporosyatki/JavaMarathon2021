package day8;

/*
*
1. Создать строку, состоящую из чисел от 0 до 20000.
* Важно понимать, что это одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
 и использовании StringBuilder, реализуйте описанную задачу этими двумя способами, замеряя время работы программы.
*/
public class Task1 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis(); // начало отсчета времени
        String string = "0 ";
        int[] mass = new int[20000];   // потомсу что стринг Не изменяемый  и создается каждый раз новыя строка , а ссылка на старую остается
        for (int i = 1; i < mass.length; i++) {
            string += i + " ";
        }
        System.out.println(string);

        long finish1 = System.currentTimeMillis(); // стоп отсчета
        long timeConsumedMillis1 = finish1 - start1; // расчет  времени
        System.out.println(timeConsumedMillis1);
        //----------
        long start = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < mass.length; i++) {
            stringBuilder.append(i + " ");               // изменяемый класс - строка 1  просто перезаписывается при конкатинации
        }
        System.out.println(stringBuilder);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);
    }
}

