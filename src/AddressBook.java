import java.util.ArrayList;
public class AddressBook {
//added comment to test changes on git hub
    //add comment for new branch
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

    public BuddyInfo removeBuddy(int index){

        if (index >=0 && index < buddies.size()){
            return buddies.remove(index);
        }
        return null;
    }

    public static void main (String[] args){
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo ("Charles", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
