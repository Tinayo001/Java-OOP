public class JedliksToyCar {
    private String model;
    private double charge;
    private double distance;

    // Default constructor
    public JedliksToyCar() {
        this.model = "Default Model";
        this.charge = 100.0;
        this.distance = 0.0;
    }

    // Parameterized constructor
    public JedliksToyCar(String model, double charge) {
        this.model = model;
        this.charge = 100.0;
        this.distance = 0.0;
    }
    public static JedliksToyCar buy() {
        return new JedliksToyCar("Lamborghini", 100.00);
    }
    public String distanceDisplay() {
        return String.format("Driven %.0f meters", distance);
    }
    public String batteryDisplay() {
        if (charge <= 0) {
            return "Battery empty";
        }
        return String.format("Battery at %.0f%%", charge);
    }
    public void drive() {
        if (charge > 0) {
            distance += 20;
            charge -= 1;
        }
    }
    
}
