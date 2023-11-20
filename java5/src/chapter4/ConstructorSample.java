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