package chapter4;

public class EncapsulationSample {

    public static void main(String[] args) {
        Swan mother = new Swan();
        Swan tita = new Swan();
        mother.setNumberEggs(-1);
        System.out.println(mother.getNumberEggs());
        tita.setNumberEggs(13);
        System.out.println(tita.getNumberEggs());

    }
}


class Swan{
      private int numberEggs;

    public void setNumberEggs(int numberEggs) {
        if(numberEggs>=0)
            this.numberEggs = numberEggs;
        else
            this.numberEggs++;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}