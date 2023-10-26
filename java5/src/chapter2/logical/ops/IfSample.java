package chapter2.logical.ops;

import java.util.Scanner;

public class IfSample {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int hourOftheDay=input1.nextInt();
        if(hourOftheDay<11)
            System.out.println("Good morning");
        else if (hourOftheDay>11 && hourOftheDay<18)
            System.out.println("Good afternoon");

         else
            System.out.println("Good evening");
    }
}
