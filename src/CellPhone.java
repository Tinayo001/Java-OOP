import java.util.ArrayList;
import java.util.List;

public class CellPhone {
    private String phoneNumber;
    private String imsino;
    private List<String> contacts;

    public CellPhone(String phoneNumber, String  imsino) {
        this.phoneNumber = phoneNumber;
        this.imsino = imsino;
        this.contacts = new ArrayList<>();
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getImsino() {
        return imsino;
    }
    public void saveContact(String contactNo) {
        contacts.add(contactNo);
        System.out.println("Contact " + contactNo + " saved successfully.");

    }
    public void deleteContact(String contactNo) {
        if (contacts.remove(contactNo)) {
            System.out.println("Contact " + contactNo + " deleted successfully.");
        } else {
            System.out.println("Contact " + contactNo + " not found.");
        }
    }
    public void showContacts() {
        System.out.println("Contacts:");
        for (String contact : contacts) {
            System.out.println(contact);
        }
    }
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone("0712345678", "IMSI12345");

        SmartPhone mySmartPhone = new SmartPhone(myPhone, "MAC-0011223344");
        mySmartPhone.saveContact("0799999999");

        myPhone.saveContact("0722000000");
        myPhone.saveContact("0799999999");

        myPhone.showContacts();

        myPhone.deleteContact("0722000000");

        myPhone.showContacts();

        mySmartPhone.showContacts();
        mySmartPhone.browseInternet();
    }

}
class SmartPhone extends CellPhone {
    private String  macNo;


    SmartPhone(CellPhone nokia, String macNo) {
        super(nokia.getPhoneNumber(), nokia.getImsino());
        this.macNo = macNo;
    }
    public String getMacNo() {
        return macNo;
    }
    public void setMacNo(String macNo) {
        this.macNo = macNo;
    }
    public static void playMusic() {
        System.out.println("The music is playing my niggah!");
    }
    public void browseInternet() {
        System.out.println("Browsing internet with MAC: " + macNo);
    }
}


