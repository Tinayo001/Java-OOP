public class Customer {
    private int custId;
    private String name;
    private String phoneNo;
    private String address;

    Customer(int custId, String name, String phoneNo, String address) {
        this.custId = custId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    Customer(int custId, String name) {
        this.custId = custId;
        this.name = name;
        this.phoneNo = "";
        this.address = "";
    }
    Customer() {
        custId = 0;
        name = "";
        phoneNo = "";
        address = "";

    }
    public int getCustId() {
        return custId;
    }


    public String getName() {
        return name;
    }


    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public static void main(String[] args) {
        Customer customer1 = new Customer(123, "Barrack Obama");

        Member member1 = new Member(customer1, 101, "27-19-1999");

        System.out.println("This is our best customer : " + member1.getName() + "\n id : " + member1.getCustId() + "\n dob " + member1.getDob());

        customer1.setPhoneNo("076754334584");
        customer1.setAddress("Nairobi Westlands-700");

        System.out.println("Customer id " + customer1.getCustId());
        System.out.println("Customer name " + customer1.getName());
        System.out.println("Customer phone no " + customer1.getPhoneNo());
        System.out.println("Customer address " + customer1.getAddress());

        Member.callback();
    }
}
class Member extends Customer {
    private int memberId;
    private String dob;

    Member(Customer tinayo, int memberId, String dob) {
        super(tinayo.getCustId(),tinayo.getName(), tinayo.getPhoneNo(), tinayo.getAddress());
        this.memberId = memberId;
        this.dob = dob;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public static void callback() {
        System.out.println("Today we are giving out a discount");
    }
}