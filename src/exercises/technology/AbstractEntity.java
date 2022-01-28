package exercises.technology;

public abstract class AbstractEntity {
    private static int count = 0;
    private int Id;

    public AbstractEntity(){
        this.Id = ++count;
    }

    public int getId() {
        return Id;
    }
}


