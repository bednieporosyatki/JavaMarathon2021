package day12.task5;
/*
5. *Выполнять в подпапке task5 в day12*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя, но и возраст.
Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist. Необходимо реализовать класс MusicArtist
и доработать класс MusicBand (создать копию класса) таким образом, чтобы участники были - объекты класса MusicArtist.
После этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и проверить состав групп после слияния.
Методы для слияния и для вывода участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
* */

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Исполнитель 1", 23));
        members1.add(new MusicArtist("Исполнитель 1", 23));
        members1.add(new MusicArtist("Исполнитель 1", 23));

        MusicBand musicBand1 = new MusicBand("Группа 1", 1990, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Исполнитель 2", 33));
        members2.add(new MusicArtist("Исполнитель 2", 33));
        members2.add(new MusicArtist("Исполнитель 2", 33));


        MusicBand musicBand2 = new MusicBand("Группа 2", 1990, members2);

        System.out.println(members1);
        System.out.println(members2);
        System.out.println();

        MusicBand.transferMembers(musicBand1, musicBand2);

        System.out.println(members1);
        System.out.println(members2);
    }
}