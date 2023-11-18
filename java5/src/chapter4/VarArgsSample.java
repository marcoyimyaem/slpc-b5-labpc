package chapter4;

public class VarArgsSample {
    protected int secretNumber = 2523;
    //single varagrs param
    protected int sumOfAllNum(int... a){
        int result = 0;
        for(int b:a)
            result+=b;
        return result;
    }
    //multi varagrs param
    String getAllDeposit(String name,
                         boolean p,
                         int w,
                         int... deposit){
        int totalDeposit = 0;
        for(int b:deposit)
            totalDeposit+=b;
        return "Hello "+name+", Total Deposit is: "+totalDeposit;
    }
//    String notAValidVarArgs(String name,
//                         boolean p,
//                         int w,
//                         int... deposit,
//                            int... withdraw){
//               return null;}
    public static float mathOps(int option,float... numbers){
        float result =0;
        switch (option){
            case 1: for(float b:numbers)
                result+=b; break;
            case 2: for(float b:numbers)
                result-=b; break;
            case 3: result=1;
                for(float b:numbers)
                    result*=b; break;
            case 4: result=1;
                for(float b:numbers)
                    result/=b; break;
        }
        return result;
    }
    public static void main(String[] args) {
        VarArgsSample va = new VarArgsSample();
        System.out.println(va.sumOfAllNum(1,2,3,4,5,6,7,8,9,10,4545,2156,2121));
        System.out.println(va.getAllDeposit("Marco",true,165,47891,4657,56498,4654,548,1654));
        System.out.println(va.getAllDeposit("Jane",false,165,4781,457,598,454,548,16));
        int[] x = new int[]{196,156,465,465,56};
        System.out.println(va.getAllDeposit("Mari",false,165,x));

//        System.out.println(va.getAllDeposit("Marco",true,165,47891,4657,56498,4654,548,1654));
        System.out.println(va.mathOps(1,5,6));
        System.out.println(va.mathOps(2,5,6));
        System.out.println(mathOps(3,5,6));
        System.out.println(va.mathOps(4,5,6));
        System.out.println(va.mathOps(4));
        System.out.println(va.sumOfAllNum());

    } //4 10 90 51 43
}
