class Data {
    int value = 0;
    boolean flag = true;

    synchronized public void set(int x) {
        try {
            while (flag == false) {
                wait();
            }
            value = x;
            flag = false;
            System.out.println("Produced: " + value);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public int get() {
        int x = 0;
        try {
            while (flag == true) {
                wait();
            }
            x = value;
            flag = true;
            System.out.println("Consumed: " + x);
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }
}

class ProducerThread extends Thread {
    private Data d;

    public ProducerThread(Data d) {
        this.d = d;
    }

    public void run() {
        int i = 1;
        while (true) {
            d.set(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerThread extends Thread {
    private Data d;

    public ConsumerThread(Data d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            d.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThread {
    public static void main(String[] args) {
        Data d = new Data();

        ProducerThread p1 = new ProducerThread(d);
        ConsumerThread c1 = new ConsumerThread(d);

        p1.start();
        c1.start();
    }
}

