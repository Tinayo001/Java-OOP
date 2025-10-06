public class Super {
    public void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Super sub1 = new Sub(); // parent reference, child object
        sub1.display();         // method overriding in action
    }
}

class Sub extends Super {
    @Override   // good practice to add this annotation
    public void display() {
        System.out.println("Hello world");
    }
}





