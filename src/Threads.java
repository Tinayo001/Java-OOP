class Test extends Thread {
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello " + name + ". You are " + age + " years old.");
            try {
                Thread.sleep(1000); // pause for 1 second to slow output
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
                break;
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Test test1 = new Test("Tinayo", 24);
        test1.start(); // start the thread (runs concurrently)

        while (true) {
            int a = 90;
            int b = 37;
            int c = a / b;
            System.out.println("The answer of the division is " + c);

            try {
                Thread.sleep(1000); // slow it down
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

