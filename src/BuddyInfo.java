public class BuddyInfo extends AddressBook {
    private String name;
    private Integer phoneNumber;
    private String address;

    public BuddyInfo(String name, String address, Integer phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public BuddyInfo() {
        this.name = "BOB";
        this.phoneNumber = 911;
        this.address = "123 Wall Street ";
    }

    public String getName() {
        return name;
    }

    // You might also want to add getters for phoneNumber and address, and perhaps setters for all fields.

    public static void main(String[] args) {
        BuddyInfo buddyInformation = new BuddyInfo("Snorlax", "Ash_got_cash",9019209);
        System.out.println("Hello " + buddyInformation.getName());
    }
}
