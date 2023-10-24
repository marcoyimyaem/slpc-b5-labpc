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

    }
    int peopleCounter(int in){
        persons += in;
        return persons;
    }
}
