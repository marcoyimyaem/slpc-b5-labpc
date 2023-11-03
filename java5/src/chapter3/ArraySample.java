package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySample {
    public static void main(String[] args) {
        int[] numbers = {6,9,1};
        Arrays.sort(numbers);

//        for (int i = 0; i<numbers.length;i++)
//            System.out.print(numbers[i]+ "\t");
        for (int number : numbers) System.out.print(number + "\t");
        System.out.println();
        String[] numuros ={"100","1","12","10","20","21","19"};
        Arrays.sort(numuros);
        for (String numero: numuros) System.out.print(numero+"\t");
        System.out.println();
        int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        int[] numbers3 = {101,32,13,4,55,26,47,-8,79,10};

//        Arrays.sort(numbers2);
        Arrays.sort(numbers3);
        for (int number : numbers3) System.out.print(number + "\t");

        System.out.println("\nBinary search result: "+Arrays.binarySearch(numbers3,11));
        System.out.println("\nBinary search result: "+Arrays.binarySearch(numbers3,12));
    }

}
