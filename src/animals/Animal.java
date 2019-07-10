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


    public Animal(String name,int discovered) {
        this.discovered = discovered;
        this.name = name;

        maxId++;
        id=maxId;
    }


    public String eat(){
        return name +" eats";
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public int id(){
        return id;
    }

    public int discovered(){
        return discovered;
    }
    public void discovered(int year){
        discovered=year;
    }

    public String name(){
        return name;
    }
    public void name(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name+" named in "+discovered+" and moves by "+move()+"ing, breathes with "+breathe()+ ", and reproduces via "+reproduce();
    }
}