package exercises.technology;

public class Computer extends AbstractEntity {
    private int storage;
    private int ram;
    private String graphicsCard;

    public Computer(int storage, int ram, String graphicsCard) {
        this.storage = storage;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public int increaseStorage(int storageIncrease){
        this.storage += storageIncrease;
        return storage;
    }

    public int getStorage() {
        return storage;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }
}
