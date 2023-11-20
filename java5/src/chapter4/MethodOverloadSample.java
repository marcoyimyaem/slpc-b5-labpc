package chapter4;

public class MethodOverloadSample {
    public void fly(int numMiles) { }
//    public static int fly(int flyspeed) {
//        return 0;
//    }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    public boolean fly(Object s) { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    public static void main(String[] args) {
//        fly(1);
        System.out.print(Glider2.glide("a"));
        System.out.print(Glider2.glide("a", "b"));
        System.out.print(Glider2.glide("a", "b", "c"));
    }
}
class Glider2 {
    public static String glide(String s) { return "1"; }
    public static String glide(String... s) { return "2"; 		}
    public static String glide(Object o) { return "3"; }
    public static String glide(String s, String t) { 			return "4"; }

}
