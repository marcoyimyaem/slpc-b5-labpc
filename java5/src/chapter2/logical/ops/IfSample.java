package chapter2.logical.ops;

import java.time.LocalDate;
import java.time.Month;
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
         final int TIME_TO_CHECK = 10;
//        LocalDate today  = LocalDate.of(2023, Month.FEBRUARY,1);
         switch (hourOftheDay){
             default:
                 System.out.println("off duty");
                 break;
             case 8:
                 System.out.println("time to login");
                 break;
             case 10:
                 System.out.println("time to break");
                 break;
             case 12:
                 System.out.println("time for lunch break");
                 break;
             case 13:
                 System.out.println("time to work PM");
                 break;
             case 15:
                 System.out.println("time for afternoon break");
                 break;
             case 17:
                 System.out.println("time to logout");
                 break;
         }

    }
}
