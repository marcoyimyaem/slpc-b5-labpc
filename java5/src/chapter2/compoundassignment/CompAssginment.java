package chapter2.compoundassignment;

public class CompAssginment {
    int persons;
    public static void main(String[] args) {
        CompAssginment mallcounter = new CompAssginment();
        System.out.println(mallcounter.persons);
        mallcounter.peopleCounter(21);
        mallcounter.peopleCounter(5);
        mallcounter.peopleCounter(16);
        System.out.println(mallcounter.persons);
        long y = 15;
        int yy = 10;
        yy+=5.5;
        System.out.println(yy);

    }
    int peopleCounter(int in){
        persons += in;
        return persons;
    }
}
