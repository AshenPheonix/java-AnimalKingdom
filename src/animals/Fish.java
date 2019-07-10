package animals;

/**
 * Fish
 */
public class Fish extends Animal{

    public Fish(String name,int discovered){
        super(name,discovered);
    }

    @Override
    public String move() {
        return "Swim";
    }

    @Override
    public String breathe() {
        return "Gills";
    }

    @Override
    public String reproduce() {
        return "Eggs";
    }
}