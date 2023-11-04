package chapter3;

import java.util.ArrayList;

public class ArralistSample {
    public static void main(String[] args) {
        ArrayList<Object> aray1 = new ArrayList<>();
        aray1.add(1);
        aray1.add(1);
        aray1.add("orage");
        aray1.add("orage2");
        aray1.add("orage3");
        aray1.add("orage4");
        ArrayList<Object>  aray2 = new ArrayList<>(aray1);
        aray1.add("orage5");
        System.out.println(aray2.toString());
        System.out.println(aray1);





    }
}
