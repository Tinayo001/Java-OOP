class Prado {
    static long price = 1000;
    int a, b;

    static double doublePrice(String city) {
        switch (city) {
            case "Nairobi":
                return price * price * 0.1;
            case "Johannesburg":
                return price * price * 0.9;
            default:
                return price;
        }
    }
}

public class StaticPrice {
    public static void main(String[] args) {
        Prado p = new Prado();
        System.out.println(p.doublePrice("Nairobi"));
    }
}
