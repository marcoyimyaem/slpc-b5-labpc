package com.medusa.example;
//    fdgsdhj hjfsdfhsk
   /* fsdfs
    sdfsdf
        sdfsd */

/**
 *
 * skdjhfkjdfhgksjhgjkfhds
 * jkdfhgjksdhfgkhdskfg
 * dfgksdjfhgjkds
 */
import java.util.Random;
public class Main {
    static ClassC ccc = new ClassC();
    public static void main(String[] args) {
        ClassC ccc = new ClassC();
        Main m = new Main();
        System.out.println(ccc.age);
        m.showClassC2(ccc.age);
        Random r = new Random();
        int money = 12;
//        Sample s = new Sample();
        System.out.println("Hello world!");
        System.out.println(r.nextInt(10));
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
//        System.gc();
        System.out.println(money++);
        System.out.println(money);
        System.out.println(--money);
        boolean hungry = false;
        char initial = 'c';
        System.out.println(initial++);
        System.out.println(initial);
        System.out.println(!hungry);
        System.out.println(hungry);
        money = money + 10;
        money+=10;


    }
    void showClassC(){
        int age = ccc.age;
    }
    void showClassC2(int ager){
        int age = ager;
    }
}
