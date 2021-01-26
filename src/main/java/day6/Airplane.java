package day6;

public class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0; // по умолчанию 0!

    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + "\n" + "год выпуска: " + year + "\n" + "длина: " + length + "\n" + "вес: " + weight + "\n" + "количество топлива в баке: " + fuel + "\n");
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;

    }

}
