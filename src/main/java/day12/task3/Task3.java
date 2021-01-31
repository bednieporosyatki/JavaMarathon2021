package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year (название музыкальной группы и год основания).
Создать 10 или более экземпляров класса MusicBand , добавить их в список
(выбирайте такие музыкальные группы, которые были созданы как до 2000 года, так и после, жанр не важен).
Перемешать список. Создать статический метод в классе Task3:

Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп, основанных после 2000 года.
Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
*/
public class Task3 {
    public static void main(String[] args) {


        MusicBand musicBand1 = new MusicBand("Группа1", 1960);
        MusicBand musicBand2 = new MusicBand("Группа2", 1970);
        MusicBand musicBand3 = new MusicBand("Группа3", 1980);
        MusicBand musicBand4 = new MusicBand("Группа4", 1990);
        MusicBand musicBand5 = new MusicBand("Группа5", 2000);
        MusicBand musicBand6 = new MusicBand("Группа6", 2005);
        MusicBand musicBand7 = new MusicBand("Группа7", 2010);
        MusicBand musicBand8 = new MusicBand("Группа8", 2015);
        MusicBand musicBand9 = new MusicBand("Группа9", 2020);
        MusicBand musicBand10 = new MusicBand("Группа10", 2021);

        List<MusicBand> band = new ArrayList<>(Arrays.asList(musicBand8, musicBand2, musicBand10, musicBand1, musicBand3, musicBand7, musicBand6, musicBand9, musicBand4, musicBand5));

        System.out.println(band);
        groupsAfter2000(band);

//        List<MusicBand> bandit =groupsAfter2000(band);   //создаем массив  и присваиваем ему значения из коллекции которые получены в методе
//        System.out.println(bandit);                      // в коллекции уже новые данные прошедшие фильтр метода

    }


    // Можно сделать  метод void ,  но в задании написано вернуть новый список  - значит ли это что я направильном пути?!
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> band2000 = new ArrayList<>();  // создаем новый массив
        for (MusicBand music : bands) {                 // циклом пробеегаемся  по коллекции
            if (music.getYear() > 2000)                 // если год группы  больше 2000
                band2000.add(music);                    // добавляем ее в созданную  новую коллекцию
        }
        System.out.println(band2000);               // можно не выводдить в консоль при  реальном использовании метода
        return band2000;
    }
}
