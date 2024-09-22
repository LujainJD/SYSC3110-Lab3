public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(){
        this.name = null;
        this.address = null;
        this.phoneNumber = 0;
    }

    public BuddyInfo(String name, String address, int phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        BuddyInfo buddy1 = new BuddyInfo ("Homer", "123 main street", 12345678);
        System.out.println("Hello " + buddy1.getName());
    }
}
