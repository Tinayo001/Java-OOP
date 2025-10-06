class Car{
    public void start() {
        System.out.println("Car started!");
    }
    public void accelerate() {
        System.out.println("Car accelerated!");
    }
}
class LuxuryCar extends Car{
    public void openRoof() {
        System.out.println("Luxury roof opened");
    }
    public void playMusic() {
        System.out.println("Luxury play music");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.accelerate();

        LuxuryCar car2 = new LuxuryCar();
        car2.start();
        car2.accelerate();
        car2.playMusic();
        car2.openRoof();
    }
}
