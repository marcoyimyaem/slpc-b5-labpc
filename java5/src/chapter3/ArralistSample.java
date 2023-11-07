package chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArralistSample {
    public static void main(String[] args) {
        ArrayList<Object> aray1 = new ArrayList<>();
        aray1.add(1);
        aray1.add(1);
        aray1.add("orage");
        aray1.add("orage2");
        aray1.add("orage3");
        aray1.add("orage4");
        aray1.add("orage");
        ArrayList<Object>  aray2 = new ArrayList<>(aray1);
        aray1.add("orage5");
        System.out.println(aray2.toString());
        System.out.println(aray1);

//        aray1.remove(2); remove index 2
        aray1.remove("orage");

        System.out.println(aray1);
        System.out.println(aray1.set(5,"orage6"));
        System.out.println(aray1);
        System.out.println("Clearing aray2");
        System.out.println(aray2);
        aray2.clear();
        System.out.println(aray2);
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a"); // [a] *** one [a] != two []
        System.out.println(one.equals(two)); // false
        two.add("a"); // [a] *** one [a] == two [a]
        System.out.println(one.equals(two)); // true
        one.add("b"); // [a,b] *** one [a,b] != two [a]
        two.add(0, "b"); // [b,a] *** one [a,b] != two [b,a]
        System.out.println(one.equals(two)); // false

        Integer a = 1;
        Double b = 2.5;
        int z = Integer.parseInt("123");
        System.out.println(a.compareTo(3));
        List numberss = new ArrayList<>();
        numberss.add(1);
        numberss.add(2);
        numberss.remove(1);
        System.out.println(numberss);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        List<Products> Fruits = new ArrayList<>();
        Fruits.add(new Products("banana",12,20,15242));
        Fruits.add(new Products("apple",300,40,152325522));
        Fruits.add(new Products("pineapple",41,50,2315232));
        Fruits.add(new Products("orange",300,40,1785522));
        Fruits.add(new Products("kiwi",58,50,15285422));
        System.out.println(Fruits);
        Collections.sort();
        for(Products fruit: Fruits)
            System.out.println("Subtotal per Product "+
                    fruit.name+": "+
                    Products.subTotalPerProduct(fruit.qty, fruit.price));
    }
}
 class Products{
    String name;
    int qty;
    float price;

    int barcode;
     public Products(){}
     public Products(String name, int qty, float price, int barcode) {
         this.name = name;
         this.qty = qty;
         this.price = price;
         this.barcode = barcode;
     }

     static float subTotalPerProduct(int qty,float price){
        return qty*price;
    }

     @Override
     public String toString() {
         return "Products{" +
                 "name='" + name + '\'' +
                 ", qty=" + qty +
                 ", price=" + price +
                 ", barcode=" + barcode +
                 '}';
     }
 }