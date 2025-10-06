class Superr {
    public void method1() {
        System.out.println("Super method1");
    }
    public void method2() {
        System.out.println("Super method2");
    }
}

class Safi extends Superr {
    @Override
    public void method2() {
        System.out.println("Sub method2");
    }
    public void method3() {
        System.out.println("Sub method3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Superr s = new Safi();
        s.method1();
        s.method2();
    }
}

