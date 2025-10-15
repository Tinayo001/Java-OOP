import java.security.PublicKey;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class ThreadCon {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread");
        t.start();

        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isAlive());

    }
}
