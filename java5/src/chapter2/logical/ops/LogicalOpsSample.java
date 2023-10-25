package chapter2.logical.ops;
import com.medusa.example.ClassC;

public class LogicalOpsSample {
    public static void main(String[] args) {
        boolean askif = true;
        int a = 4;
        double b = 0.45;
        System.out.println( askif == (5<6) && (6>5) );
        System.out.println(a==b);
        double d = a+b;
        int c = a+=b;

        double f = b+a;
        double e = a+=b;


        System.out.println( c== d);

        System.out.println(e != f);
        ClassC cc = new ClassC();
        ClassC cc2 = new ClassC();
        ClassC cc3 = cc;

        System.out.println(cc3.toString());
        System.gc();

    }
}
