public class Mommy {
    private String name;
    private String phoneNo;

    Mommy(String name, String PhoneNo) {
        this.name = name;
        this.phoneNo = PhoneNo;
    }
    void display() {
        System.out.println("Moms name :" + this.name);
        System.out.println("Moms phone number :" + this.phoneNo);
    }
    public static void main(String[] args) {
        Mommy mom = new Mommy("Alice", "0722123456");
        mom.display();
    }
}
