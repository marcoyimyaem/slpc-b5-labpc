package chapter4;

public class StaticFinalSample {
    public static final int NUM_BUCKETS = 45;
    public static final int NUM_BUCKETSS;
    static {
        NUM_BUCKETSS = 1;
//        NUM_BUCKETSS = 2; //error
    }


    public static void main(String[] args) {
//        NUM_BUCKETS = 5; //error

    }
}
