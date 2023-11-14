package chapter4;

public class SimpleArithmeticMethod {
    static int gg;
    void recur(int x){
        System.out.println("recursion value of x:"+x);
        --x;
        if(x != 0)
            recur(x);
        else System.out.println("end");
    }
    public int add(int a,int b){
        return a+b;
    }
    public int minus(int a,int b){
        return a-b;
    }
    public float div(int a,int b){
        return a/b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public float combo(){
        SimpleArithmeticMethod mathops = new SimpleArithmeticMethod();
        return mathops.minus(mathops.mul(3,3),mathops.add(5,9));
    }

    public static void main(String[] args) {
        String[] emotu = new String[]{"\uD83E\uDD73","\uD83E\uDD73","\uD83E\uDD73","\uD83E\uDD73",};
        System.out.println(emotu[0]);
        SimpleArithmeticMethod mathops= new SimpleArithmeticMethod();
        System.out.println(mathops.add(7,9));
        System.out.println(mathops.minus(7,9));
        System.out.println(mathops.div(7,9));
        System.out.println(mathops.mul(7,9));
        mathops.recur(5);
        System.out.println(mathops.combo());



    }
}
