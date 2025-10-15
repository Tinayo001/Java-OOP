class MyRun implements Runnable {
    public void run() {

    }

}

public class ThreadTest {

    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new MyRun());
    }
}
