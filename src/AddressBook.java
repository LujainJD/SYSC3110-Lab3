import java.util.ArrayList;
public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    //constructor
    public AddressBook(){
        this.buddies = new ArrayList<>();
    }

    public void addBuddy (BuddyInfo buddy){
        if (buddy != null){
            this.buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        this.buddies.remove(buddy);
    }

    public static void main (String[] args){
        System.out.println("Address Book");
    }
}
