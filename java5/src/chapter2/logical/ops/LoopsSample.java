package chapter2.logical.ops;

public class LoopsSample {
    public static void main(String[] args) {
        int a = 1;
        while(a<5)
            System.out.println("a: "+a++);

        int b = 1;
        do
            System.out.println("b: "+b++);
        while (b<5);
//print b one time only
        do {
            System.out.println("b: " + b++);
            b=6;
        }while (b<5);

        for(int q = 0;q<5;q++)
            System.out.println("q: "+ (q));
// infin8 loop
        //        for(int q = 0;q<5; System.out.println("hello"))
//            System.out.println("q: "+ (q++));

    }


}
