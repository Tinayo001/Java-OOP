import java.util.concurrent.Callable;

interface Member1 {
    void callback();
}
class Customer1 implements Member1 {
    String name;

    Customer1(String name) {
        this.name = name;
    }
    @Override
    public void callback() {
        System.out.println("OK i will visit! " + name);
    }
}
class Store {
    Member1 mem[] = new Member1[20];
    int count = 0;

    void register(Member1 m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Store store1 = new Store();
        Customer1 customer1 = new Customer1("Jack");
        Customer1 customer2 = new Customer1("Anerlisa");

        store1.register(customer1);
        store1.register(customer2);

        store1.inviteSale();
    }
}
