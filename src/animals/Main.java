package animals;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Main
 */
public class Main {

    public static void printAnimals(ArrayList<Animal> AL, Test tester){
        for(Animal a : AL){
            if(tester.test(a)){
                System.out.println(a);
            }
        }
    }

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

        animalKingdom.sort((Animal a1, Animal a2)->{
            return a1.discovered()-a2.discovered();
        });
        System.out.println("*** Sort by Year Discovered ***");
        animalKingdom.forEach(a->System.out.println(a));

        System.out.println("\n*** Sorted by Name ***");
        animalKingdom.sort((Animal a1, Animal a2)->{
            return a1.name().compareToIgnoreCase(a2.name());
        });
        animalKingdom.forEach(a->System.out.println(a));

        System.out.println("\n*** Sorted by movement ***");
        animalKingdom.sort((Animal a1, Animal a2)->a1.move().compareToIgnoreCase(a2.move()));
        animalKingdom.forEach(a->System.out.println(a));


        System.out.println("\n*** Filtered by Lungs ***");
        printAnimals(animalKingdom, a->a.breathe()=="Lungs");

        System.out.println("\n*** Filtered by Lungs and named in 1758 ***");
        printAnimals(animalKingdom, a->a.breathe()=="Lungs" && a.discovered()==1758);

        System.out.println("\n*** Filtered by Lungs and Eggs ***");
        printAnimals(animalKingdom, a->a.breathe()=="Lungs" && a.reproduce()=="Eggs");

        System.out.println("\n*** Sorted by name and named in 1758 ***");
        animalKingdom.sort((Animal a1, Animal a2)->{
            return a1.name().compareToIgnoreCase(a2.name());
        });
        printAnimals(animalKingdom, a->a.discovered()==1758);

        System.out.println("\n*** Stretch ***");
        printAnimals(animalKingdom, a-> a instanceof Mammal);
    }
}