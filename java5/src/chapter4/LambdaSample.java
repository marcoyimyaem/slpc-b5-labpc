package chapter4;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class LambdaSample {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish",false,true,5));
        animals.add(new Animal("Kangaroo",true,false,3));
        animals.add(new Animal("Rabbit",true,false,1));
        animals.add(new Animal("Turtle",false,true,9));
        animals.add(new Animal("Frog",true,true,2));
        System.out.println("Animals that can Hop");
//        print(animals,new CheckIfHopper());
        print(animals, a -> a.canHop());
        System.out.println("Animals that can Swim");
//        print(animals,new CheckIfSwimmer());
        print(animals, a -> a.canSwim());
        System.out.println("Animals that can Hop and Swim");
        print(animals, a -> a.canHop() && a.canSwim());
        System.out.println("Animals that age is more than 5");
        print(animals, a -> a.getAge()>5);
    }
    public static void print(List<Animal> animals, Predicate<Animal> checker){
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
    private int age;
    public Animal(String speciesName, boolean hopper, boolean swimmer,int age) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public int getAge(){ return age;}
    public String toString() { return species; }
}

//interface CheckTrait {
//    boolean test(Animal a);
//}

interface Predicate<T> {
    boolean test(T t);
}

//class CheckIfHopper implements CheckTrait {
//    public boolean test(Animal a) {
//        return a.canHop();
//    }
//}
//class CheckIfSwimmer implements CheckTrait {
//    public boolean test(Animal a) {
//        return a.canSwim();
//    }
//}
