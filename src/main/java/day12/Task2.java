package day12;

import java.util.ArrayList;
import java.util.List;

/*
2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
* */
public class Task2 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

//  вариант с фор
        for (int i = 0; i < 350; i++) {
            if (i > 0 && i <= 30 && i % 2 == 0 || i >= 300 && i <= 350 && i % 2 == 0)
                num.add(i);
        }
        System.out.println(num);
    }

// ---------------  Вариант с циклом Вайл----------------
//        int count = 0;
//        while (count < 350) {
//            count++;
//            if (count > 0 && count <= 30 && count % 2 == 0 || count >= 300 && count <= 350 && count % 2 == 0)
//                num.add(count);
//        }
//
//        System.out.println(num);


}
