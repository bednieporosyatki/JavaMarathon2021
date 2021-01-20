package day1;

/*
6. Объявите переменную типа int, имя переменной - k. Присвойте этой переменной какую-нибудь цифру от 1 до 9.
Используя цикл на ваше усмотрение (for или while), выведите в консоль таблицу умножения для этой цифры в следующем формате:
Пример:
k = 3
Вывод в консоль:
1 x 3 = 3
2 x 3 = 6 ... 
*/
public class Task6 {

    public static void main(String[] args) {
        int k = 9;

        for (int i = 1; i <= 10; i++) {
            int result = i * k;
            System.out.println(i + " x " + k + " = " + result);
        }

    }
}
