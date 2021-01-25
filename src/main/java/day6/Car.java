package day6;

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

    public void info(int year) {

        int result = year - this.yearProduction;
        if (result > 0)
            System.out.println("Этот автомобиль:" + result);

    }
}
