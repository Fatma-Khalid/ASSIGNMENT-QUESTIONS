public class Physics {
    private int current;
    private int resistence;

    public Physics(){
        current = 2;
        resistence = 8;

    }
    public Physics(int cur, int res){
        current = cur;
        resistence = res;
    }
    public int calcVoltage(){
        return current * resistence;
    }
public static void main(String[] args) {
    Physics voltage1 = new Physics();
    System.out.println("the first voltage is: "+ voltage1.calcVoltage());
    Physics voltage2 = new Physics(7,7);
    System.out.println("the second voltage is: "+ voltage2.calcVoltage());
}
    
}