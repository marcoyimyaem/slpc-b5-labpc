package chapter3;

public class VarArgsSample {

    static double avg(double... grades) {
        double result = 0, totalGrades = 0;
        for (double grade : grades) {
            totalGrades += grade;
        }
        return result = totalGrades / (grades.length);
    }


    public static void main(String[] args) {
//        double[] finalGrades = {90,99.6,87,91.6};
//        System.out.println(avg(new double[]{90,99.6,87,91.6}));
        System.out.println(avg(90,99.6,87,91.6,99,99,99,85));
    }
}
