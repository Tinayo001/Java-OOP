class Test1 implements Runnable {
    private String name;

    public Test1(String name) {
        this.name = name;
    }

    public void run() {
        int i = 1;

        while (true) {
            System.out.println("Hello " + name);
            i++;
            try {
                Thread.sleep(1000); // 1-second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Test1 test1 = new Test1("Orumoi");
        Thread m = new Thread(test1);
        m.start();

        int i = 1;
        while (true) {
            int a = 12;
            int b = 4;
            int c = a/b;
            System.out.println(c);
            i++;
            try {
                Thread.sleep(1000); // 1-second pause
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
