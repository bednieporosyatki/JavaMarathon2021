package day6;

import javax.crypto.spec.PSource;

public class Car {
    private int yearProduction;
    private String color;
    private String model;

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYerProduction(int year) {
        this.yearProduction = year;
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

    public void info() {

        System.out.println("Этот автомобиль: " + yearProduction + " года");
    }

    public int yearDifference(int inputYear) {
        int result = inputYear - yearProduction;
        if (result > 0) {
            return result;
        }
        result = yearProduction - inputYear;
        return result; //

    }
}
