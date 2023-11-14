package chapter4;

public class MethodSample {
    public int carAirconOff(){
//        Integer x = 0;
        return 0;
    }
    public boolean isCarAirconOff(){
        return false;
    }
    public void setCarTemp(int control){
 return;
    }
    public int sum(int a,int b){
        setGrear(12);
        return a+b;


    }
    private void setGrear(int grear){
//      setgearofcar

    }
    protected void openCarDoor(){
        // open car door
    }
    void closeCarDoor(){

    }
    static  final public boolean isItTrue(){
        return false;
    }
//    error java reserved words method name
//    public int int(){
//        return;
//    }
    String getHomeAddress(){
        return null;
    }
    int getAge(int a){
//        if(a==4 )
//            return a;
        int b = 0;
        if(a==4 ) return b;
//          b=a;
        else
            return b;
//        bad code but valid

    }
    int num(){
        return (int)9L;
    }
    public static void main(String[] args) {
        MethodSample ms = new MethodSample();

        System.out.println((ms.sum(13,89)));
    }


}
