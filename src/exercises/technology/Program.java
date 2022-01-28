package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Computer lightSpeed = new Computer(1000, 64, "Light Speed 3070");
        System.out.println("The current storage is " + lightSpeed.getStorage() + "Gb");
        System.out.println("The current ram is " + lightSpeed.getRam() + "Gb");
        System.out.println("The current graphics card is " + lightSpeed.getGraphicsCard());
        lightSpeed.increaseStorage(500);
        System.out.println("The new storage is " + lightSpeed.getStorage() + "Gb");

        Laptop stingRay = new Laptop(1000, 32, "String Ray 3080", 12);
        System.out.println("The current storage is " + stingRay.getStorage() + "Gb");
        System.out.println("The current ram is " + stingRay.getRam() + "Gb");
        System.out.println("The current graphics card is " + stingRay.getGraphicsCard());
        System.out.println(stingRay.toHeavy());

        Smartphone iphone = new Smartphone(64, 16,"N/A",120,500);
        System.out.println("The current Smartphone storage is " + iphone.getStorage() + "Gb");
        System.out.println("The current ram is " + iphone.getRam() + "Gb");
        System.out.println("The current number of apps is " + iphone.getNumOfApps());
        System.out.println("The current number of contacts is " + iphone.getNumOfContacts());
        iphone.addContact(1);
        System.out.println("The new number of contacts " + iphone.getNumOfContacts());
        System.out.println("The ID for my smartphone is: " + iphone.getId());
        System.out.println("The ID for my laptop is: " + stingRay.getId());
        System.out.println("The ID for my computer is: " + lightSpeed.getId());


    }
}
