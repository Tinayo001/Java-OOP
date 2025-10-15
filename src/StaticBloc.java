class Our {
    static int x;
    String name = "Kelitu";

    static void block1() {
        x = 10;
        System.out.println("static block1: " + x);
    }

    static void block2() {
        x = 20;
        System.out.println("static block2: " + x);
    }
}

public class StaticBloc {
    public static void main(String[] args) {
        Our.block1();
        Our.block2();
        System.out.println("Main method executed.");
    }
}
