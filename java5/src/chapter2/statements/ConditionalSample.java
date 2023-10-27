package chapter2.statements;

public class ConditionalSample {
    public static void main(String[] args) {
        int x =8;
        int y = 13;
        if(x<12)
            System.out.println("Good morning");
        if(y>11){
            System.out.println("Good afternoon");
            System.gc();
        }
    }
}
