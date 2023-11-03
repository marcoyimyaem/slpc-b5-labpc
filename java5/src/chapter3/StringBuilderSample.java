package chapter3;

import java.util.Scanner;

public class StringBuilderSample {
    public static void main(String[] args) {
//        Scanner s1 = new Scanner(System.in);
//        String name = s1.nextLine();
//        int x = s1.nextInt();
//        StringBuilder sb1 = new StringBuilder(name).reverse();
//        System.out.println(name.contentEquals(sb1));
        String x = "";
        x+="Hello";
        x+=" world";
//        a += 2 expands to a = a + 2. A String concatenated with any other type gives
//        a String. Lines 14, 15, and 16 all append to a, giving a result of "2cfalse". The if
//        statement on line 18 returns false because the values of the two String objects are the
//        same using object equality. The if statement on line 17 returns false because the two
//        String objects are not the same in memory. One comes directly from the string pool
//        and the other comes from building using String operations
        String y = "Hello world";

        System.out.println(x=="Hello world");

//        System.out.println(name.equals(sb1.reverse().toString()));
    }
}
