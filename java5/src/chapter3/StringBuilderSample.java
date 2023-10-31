package chapter3;

import java.util.Scanner;

public class StringBuilderSample {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String name = s1.nextLine();
//        int x = s1.nextInt();
        StringBuilder sb1 = new StringBuilder(name).reverse();


        System.out.println(name.contentEquals(sb1));
    }
}
