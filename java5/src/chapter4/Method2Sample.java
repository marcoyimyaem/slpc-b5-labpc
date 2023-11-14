package chapter4;

public class Method2Sample {
    public static void main(String[] args) {
        MethodSample ms = new MethodSample();
//        ms.setGrear(12); error
        System.out.println((ms.sum(13,89)));
        ms.openCarDoor();
        ms.closeCarDoor();
    }
}
