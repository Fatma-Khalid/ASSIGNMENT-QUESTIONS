import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("enter the actual value");
        double actualValue = s.nextDouble();
        System.out.println("enter the tax rate: ");
        double taxrate = s.nextDouble();
        double assessedvalue = actualValue * 0.6;
        double annualpropertytax = (assessedvalue/100.00)*taxrate;
        System.out.println("the annual property tax for the property value"+actualValue+"is"+annualpropertytax);

    }
}
