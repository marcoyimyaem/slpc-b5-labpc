package Chapter5;

import chapter4.VarArgsSample;

public class ExtendsSample extends VarArgsSample {

    public static void main(String[] args) {
        ExtendsSample va = new ExtendsSample();
        System.out.println(va.secretNumber);
        va.sumOfAllNum();
    }
}
