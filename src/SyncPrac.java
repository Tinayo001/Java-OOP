class ATM {
    private String name;
    private double amount;

    public ATM(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    synchronized public void checkBalance(String customerName) {
        System.out.println(customerName + " is checking balance...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Available balance: " + amount);
    }

    synchronized public void withdraw(String customerName, double withdrawAmount) {
        System.out.println(customerName + " is withdrawing " + withdrawAmount + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (amount >= withdrawAmount) {
            amount -= withdrawAmount;
            System.out.println(customerName + " completed withdrawal. New balance: " + amount);
        } else {
            System.out.println("Sorry " + customerName + ", insufficient funds!");
        }
    }
}

class CustomerThread extends Thread {
    private ATM atm;
    private String customerName;
    private double withdrawAmount;

    public CustomerThread(ATM atm, String customerName, double withdrawAmount) {
        this.atm = atm;
        this.customerName = customerName;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        atm.checkBalance(customerName);
        atm.withdraw(customerName, withdrawAmount);
    }
}

public class SyncPrac {
    public static void main(String[] args) {
        ATM atm = new ATM("KCB Bank", 10000);

        CustomerThread c1 = new CustomerThread(atm, "Alicia", 4000);
        CustomerThread c2 = new CustomerThread(atm, "Brian", 7000);

        c1.start();
        c2.start();
    }
}

