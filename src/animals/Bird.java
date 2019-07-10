package animals;

/**
 * Bird
 */
public class Bird extends Animal{

    public Bird(String name,int discovered){
        super(name,discovered);
    }

    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String breathe() {
        return "Lungs";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}