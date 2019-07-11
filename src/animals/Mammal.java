package animals;

/**
 * Mammal
 */
public class Mammal extends Animal{

    public Mammal(String name,int discovered){
        super(name,discovered);
    }

    @Override
    public String move() {
        return "Walk";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Live Birth";
    }    
}