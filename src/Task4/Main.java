package Task4;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(2010);
        Car car3 = new Car(2010, 240);
        Car car4 = new Car(2010, 240, 2000);
        Car car5 = new Car(2010, 240, 2000, "white");

        System.out.println("Машина 1: " + car1.view());
        System.out.println("Машина 2: " + car2.view());
        System.out.println("Машина 3: " + car3.view());
        System.out.println("Машина 4: " + car4.view());
        System.out.println("Машина 5: " + car5.view());
    }
}
