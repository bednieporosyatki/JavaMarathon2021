package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int age;
    private List<MusicArtist> members;

    public int getAge() {
        return age;
    }



    public MusicBand(String name, int age, List<MusicArtist> members) {
        this.name = name;
        this.age = age;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (MusicArtist members : musicBand1.getMembers()) {
            musicBand2.getMembers().add(members);
        }
        musicBand1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return  name + '\'' +
                ", members=" + members +
                '}';
    }
}

