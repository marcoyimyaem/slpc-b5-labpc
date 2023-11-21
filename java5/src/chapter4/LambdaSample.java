package chapter4;

import java.util.ArrayList;
import java.util.List;

public class LambdaSample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish",false,true));
        animals.add(new Animal("Kangaroo",true,false));
        animals.add(new Animal("Rabbit",true,false));
        animals.add(new Animal("Turtle",false,true));
        animals.add(new Animal("Frog",true,true));
        System.out.println("Animals that can Hop");
        print(animals,new CheckIfHopper());
        System.out.println("Animals that can Swim");
        print(animals,new CheckIfSwimmer());

    }
    public static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal: animals){
            if(checker.test(animal))
                System.out.println(animal);
        }
        System.out.println();

    }
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}
class CheckIfSwimmer implements CheckTrait {
    public boolean test(Animal a) {
        return a.canSwim();
    }
}
