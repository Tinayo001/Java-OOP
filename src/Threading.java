class Greeting extends Thread {
    String name;

    public Greeting(String name) {
        this.name = name;

    }
    @Override
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

public class Threading {
    public static void main(String[] args) {
        Greeting greeting = new Greeting("Tinayo");
        greeting.start();

        int i = 10;
        int j = 4;
        while (true) {
            int b = i/j;
            System.out.println(b);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
