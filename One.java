import java.util.Scanner;
public class One {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the two digit integer: ");
        int x = s.nextInt();
        if (x<10||x>99||x%10==0) {
            System.out.println("enter the two digit integer: ");

            
        }
        else{
            int y =(x%10)*10+(x/10);
            System.out.println("x: " +x);
            System.out.println("y: "+ y);
            System.out.println("x+y: "+ (x+y));
        }
    }
}