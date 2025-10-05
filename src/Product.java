public class Product {
    private final int itemno;   // immutable
    private final String name;  // immutable
    private double price;
    private int quantity;

    // Full constructor
    public Product(int itemno, String name, double price, int quantity) {
        this.itemno = itemno;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Constructor with only itemno & name
    public Product(int itemno, String name) {
        this.itemno = itemno;
        this.name = name;
        this.price = 0;       // default
        this.quantity = 0;    // default
    }

    // No-arg constructor (optional)
    public Product() {
        this.itemno = 0;
        this.name = "";
        this.price = 0;
        this.quantity = 0;
    }

    // Getters
    public int getItemno() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters for mutable fields
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Main method
    public static void main(String[] args) {
        Product p1 = new Product(2, "mandazi");  // only id & name fixed

        p1.setPrice(5000);   // set later
        p1.setQuantity(10);  // set later

        System.out.println("The item number is " + p1.getItemno());
        System.out.println("The item name is " + p1.getName());
        System.out.println("The item price is " + p1.getPrice());
        System.out.println("The item quantity is " + p1.getQuantity());
    }
}

