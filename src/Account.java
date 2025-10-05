public class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private int balance;

    public Account() {
    }

    public Account(String accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = "";
        this.phoneNo = "";
        this.balance = 0;
    }

    public Account(String name, String address, String phoneNo) {
        this.accountNo = "";  // Could generate automatically
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.balance = 0;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    protected void setBalance(int balance) {  // Protected for subclass access
        this.balance = balance;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + accountNo + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(Account account) {
        super();  // Call default super constructor
        setAccountNo(account.getAccountNo());
        setName(account.getName());
        setAddress(account.getAddress());
        setPhoneNo(account.getPhoneNo());
        setBalance(account.getBalance());
    }

    public void deposit(int amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }
}

class LoanAccount extends Account {
    // Assuming balance is negative for outstanding loan
    public void payEMI(long amount) {
        if (amount > 0 && getBalance() + amount <= 0) {  // Prevent overpayment
            setBalance((int) (getBalance() + amount));  // Cast long to int; handle overflow in real code
            System.out.println("Paid EMI: " + amount + ", Remaining Balance: " + getBalance());
        } else {
            System.out.println("Invalid EMI amount");
        }
    }

    public void repay(long amount) {
        if (amount > 0) {
            setBalance((int) (getBalance() + amount));
            if (getBalance() > 0) {
                setBalance(0);  // Cap at 0 if overpaid
            }
            System.out.println("Repaid: " + amount + ", Remaining Balance: " + getBalance());
        } else {
            System.out.println("Invalid repayment amount");
        }
    }
    public static void main(String[] args) {
        Account account1 = new Account("ACC001", "Drake");
        account1.setBalance(5000);
        account1.setAddress("Parklands-101");
        account1.setPhoneNo("0711654421");

        SavingsAccount savings = new SavingsAccount(account1);

        savings.deposit(4000);  // Now updates balance correctly
        savings.withdraw(3000);

        System.out.println("Account number: " + account1.getAccountNo());
        System.out.println("Account name: " + account1.getName());
        System.out.println("Account address: " + account1.getAddress());
        System.out.println("Account phone no: " + account1.getPhoneNo());
        System.out.println("Account balance: " + account1.getBalance());  // Still 5000 (copied state)
        System.out.println("Savings account balance: " + savings.getBalance());  // 6000 after ops
        System.out.println("Savings account address: " + savings.getAddress());
        System.out.println("Savings account phone no: " + savings.getPhoneNo());

        // Test LoanAccount
        LoanAccount loan = new LoanAccount();
        loan.setBalance(-10000);  // Simulate loan
        loan.payEMI(2000);
        loan.repay(3000);
        System.out.println(loan);  // Uses toString
    }
}

// Separate test class


