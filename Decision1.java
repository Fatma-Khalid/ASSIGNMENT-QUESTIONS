import java.util.Scanner;
public class Decision1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = s.nextInt();
        System.out.println("enter year of citizenship: ");
        int year = s.nextInt();
         
        boolean senate = age >= 30 || year >=9;
        boolean house = age >=25 || year >= 7;
        System.out.println("senate eligible"+ (senate? "yes":"no"));
        System.out.println("house eligible"+ (house? "yes":"no"));
    }
}
