package animals;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animalKingdom=new ArrayList<>();

        //adding mammals
        animalKingdom.add(new Mammal("Panda", 1869));
        animalKingdom.add(new Mammal("Zebra", 1778));
        animalKingdom.add(new Mammal("Koala", 1816));
        animalKingdom.add(new Mammal("Sloth", 1804));
        animalKingdom.add(new Mammal("Armadillo", 1758));
        animalKingdom.add(new Mammal("Raccoon", 1758));
        animalKingdom.add(new Mammal("BigFoot", 2021));

        //adding birds
        animalKingdom.add(new Bird("Pigeon", 1837));
        animalKingdom.add(new Bird("Peacock", 1821));
        animalKingdom.add(new Bird("Toucan", 1758));
        animalKingdom.add(new Bird("Parrot", 1824));
        animalKingdom.add(new Bird("Swan", 1758));
        
        //adding fish
        animalKingdom.add(new Fish("Salmon", 1758));
        animalKingdom.add(new Fish("Catfish", 1817));
        animalKingdom.add(new Fish("Perch", 1758));

        
    }

    
}