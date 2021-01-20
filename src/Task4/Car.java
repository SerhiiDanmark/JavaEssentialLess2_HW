package Task4;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this (year);
        this.speed = speed;
    }

    public Car(int year, int speed, int weight) {
        this (year, speed);
        this.weight = weight;
    }

    public Car(int year, int speed, int weight, String color) {
        this (year, speed, weight);
        this.color = color;
    }

    public String toString() {
        return "year = " + year + " speed = " + speed + " weight = " + weight + " color = " + color;
    }
}