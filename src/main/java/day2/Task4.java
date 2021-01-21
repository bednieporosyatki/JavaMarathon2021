package day2;

import java.util.Scanner;

/*Пояснение.
Формула для вычисления значения y содержит две составляющие - набор выражений для вычисления значения y
и условие, при котором то или иное выражение “срабатывает”.
Выполнение того или иного условия зависит от значения x.
Например, если x = 100, будет использовано самое первое выражение.
С помощью него, используя значение x будет вычислено значение y.
        y = (100^2 - 10) / (100 + 7) = 93.3644859813
*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y=420;
        x = scanner.nextDouble();

        if (x >= 5) {
            y = (x * x - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        }
        System.out.println(y);


    }
}
