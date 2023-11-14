package test.pack;
import chapter4.MethodSample;
import com.medusa.example.*;
import java.util.Random;

public class ClassB extends MethodSample {
    public static void main(String[] args) {
        ClassA ca =new ClassA();
        ClassA aa = ca;
//        System.out.println(aa instanceof ClassA);
        ClassC cc=new ClassC();
        System.out.println("hello "+ca.name);
        System.out.println("you are now "+cc.age);
        ClassC ccc = new ClassC();
        ClassC cccc=cc;
        ca.name = "Pedro";
        System.out.println("hello "+ca.name);

        System.out.println(cc instanceof ClassC);
        ClassB classB = new ClassB();
        classB.openCarDoor();
//        classB.closeCarDoor();
    }
}
