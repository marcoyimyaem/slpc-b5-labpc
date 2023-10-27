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
// infin8 loop for(;;)
        //        for(int q = 0;q<5; System.out.println("hello"))
//            System.out.println("q: "+ (q++));
//        for(;;)
//            System.out.println("Hello infinite loop");
        String[] colors = {"Red","Blue","Black","Pink","Green"};
        for(String color:colors)
            System.out.print(color+", ");
        System.out.println();

ROW:        for(int m = 1;m<=10;m++) {
COL:            for (int n = 1; n <= 10; n++) {
                System.out.print(n*m+"\t");
            }
            System.out.println();
        }

        ROW2: for(int m = 1;m<=10;m++) {
            COL2: for (int n = 1; n <= 10; n++) {
                System.out.print(n+"\t");
                if(n==5) {
//                    break COL2;
                    continue COL2;
                }
                System.out.println("@");
            }
            System.out.println();
        }
    }


}
