import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo>allBuddies;

    public AddressBook() {
        this.allBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        if (buddyInfo != null){
            allBuddies.add(buddyInfo);
        }
    }
    public void removeBuddy(BuddyInfo buddyInfo){
        allBuddies.remove(buddyInfo);
    }
    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton",613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}

