package exercises.technology;

public class Laptop extends Computer{
    private int weight;
    private int storage;
    private int ram;
    private String graphicsCard;

    public Laptop(int storage, int ram, String graphicsCard, int weight) {
        super(storage, ram, graphicsCard);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public boolean toHeavy(){
        if(weight > 12){
            return true;
        }
        return false;
    }

}
