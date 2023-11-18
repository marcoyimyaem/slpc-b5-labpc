package chapter4;

public class PassByValue {
    public static void main(String[] args) {
        Integer original1 = 1;
        Integer original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }
    public static void swap(Integer a, Integer b) {
        Integer temp = a; a=b; b= temp;
    }

}
