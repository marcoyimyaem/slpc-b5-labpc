package chapter4;

public class ConstructorSample {
    int age;

    public ConstructorSample(){
        System.out.println("Constructor initialized");
    }
    public ConstructorSample(int age){
        this.age = age;
    }

    public static void main(String[] args) {

        ConstructorSample a = new ConstructorSample();
        ConstructorSample b = new ConstructorSample();
        ConstructorSample c = a;

        ConstructorSample d = new ConstructorSample(31);
        System.out.println(d.age);
        System.out.println(a.age);
        System.out.println(b.age);
        Bunny rabit1 = new Bunny();
        Bunny rabit2 = new Bunny(2,"Buggs","Gray","White");
        Bunny rabit3 = new Bunny(3,"Lola Bunny","pink","White");
        rabit1.age = 3;
        rabit1.name = "rabituza";
        rabit1.color = new String[]{"white"};
        Hamster hamtaro = new Hamster(1);
        System.out.println(hamtaro.weight+" **  "+hamtaro.color);
        Mouse daga = new Mouse(15);
        daga.print();
        System.out.println("read to constructor");
        new InitializationOrder();
    }
}
class Bunny{
   int age;
   String name;
   String[] color;

    public Bunny(int age, String name, String... color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public Bunny() {
    }
}

class Hamster {
    String color;
    int weight;
    public Hamster(int weight) { // first constructor
//        this.weight = weight;
//        color = "brown";
//        new Hamster(weight,"brown"); // will compile but no value or default value will be assigned
        this(weight,"brown");
    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
}

class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }
    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }
    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
}

class InitializationOrder {
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT++;
        System.out.println(COUNT);
    }

    public InitializationOrder() {
        System.out.println("constructor");
    }
}
