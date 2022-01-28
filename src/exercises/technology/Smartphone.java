package exercises.technology;

public class Smartphone extends Computer {
    private int storage;
    private int numOfApps;
    private int numOfContacts;


    public Smartphone(int storage, int ram, String graphicsCard, int numOfApps, int numOfContacts) {
        super(storage, ram, graphicsCard);
        this.numOfApps = numOfApps;
        this.numOfContacts = numOfContacts;
    }

    public int addContact(int contactToAdd){
        this.numOfContacts += contactToAdd;
        return numOfContacts;
    }

    public int getNumOfApps() {
        return numOfApps;
    }

    public int getNumOfContacts() {
        return numOfContacts;
    }
}
