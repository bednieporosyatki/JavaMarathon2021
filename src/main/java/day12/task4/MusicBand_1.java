package day12.task4;

import java.util.ArrayList;
import java.util.List;

// мой первый косяк (не правилоьно понял задание переделать!)
class MusicBand1 {
    private String name;
    private String group;

    public MusicBand1(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return name + " " + group;
    }

    public static List<day12.task4.MusicBand> transferMembers(List<day12.task4.MusicBand> group1, List<day12.task4.MusicBand> group2) {
        for (day12.task4.MusicBand x : group1) {
            group2.add(x);
        }
        group1.clear();
        System.out.println(group2);
        return group2;
    }


}
