package day6;

public class Motorbike {
    private int yearProduction;
    private String color;
    private String model;

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Motorbike(int yearProduction, String color, String model) {
        this.yearProduction = yearProduction;
        this.color = color;
        this.model = model;
    }

    public void info(int year) {
        int result = year - this.yearProduction;
        if (result > 0)
            System.out.println("Этот мотоцикл:" + result);

    }
}