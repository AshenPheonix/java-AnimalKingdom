package animals;

/**
 * Animal
 */
public abstract class Animal {
    private static int maxId=0;
    private int id, discovered;
    private String name;

    public Animal(){
        maxId++;
        id=maxId;
    }
}