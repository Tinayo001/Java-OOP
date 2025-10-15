class MyData {
    synchronized public void Display(String str) {
        for (int i = 0;  i < str.length(); i++) {
            System.out.println(str.charAt(i));
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread {
    MyData d;
    public MyThread1(MyData d) {
        this.d = d;
    }
    @Override
    public void run() {
        d.Display("Hello World");
    }

}
class MyThread2 extends Thread {
    MyData data;
    public MyThread2(MyData data) {
        this.data = data;
    }
    @Override
    public void run() {
        data.Display("Hello Tinayo");
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();

    }
}
