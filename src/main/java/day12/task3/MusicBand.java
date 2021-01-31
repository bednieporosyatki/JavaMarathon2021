package day12.task3;

public class MusicBand {
    private String name;
    private int year;

    @Override
    public String toString() {
        return name + " год " + year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
