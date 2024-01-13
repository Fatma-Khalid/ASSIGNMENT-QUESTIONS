public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerIterm;

    public Invoice(String partNumber, String partDescripition, int quantity, double pricePerIterm){
        this.partNumber = partNumber;
        this.partDescription = partDescripition;
        this.quantity = quantity;
        this.pricePerIterm = pricePerIterm;
    }
    public String getpartNumber(){
        return partNumber;
    }
    public void setpartNumber(String partNumber){
        this.partNumber = partNumber;

    }
    public String getpartDescription(){
        return partDescription;
    }
    public void setpartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public int getquantity(){
        return quantity;
    }
    public void setquantity(int quantity){
        this.quantity = quantity;
    }
    public double getpricePerIterm(){
        return pricePerIterm;
    }
    public void setpricePerIterm(double pricePerIterm){
        this.pricePerIterm =pricePerIterm;
    }

    public double calculateInvoice(){
        return quantity * pricePerIterm;
    }
    public static void main(String[] args) {
        Invoice item1 = new Invoice("A001", "widget", 5, 2.5);
        Invoice item2 = new Invoice("B001", "Gadget", 3, 4.0);

        System.out.println("the total invoive amount for item 1 is: $"+item1.calculateInvoice());
        System.out.println("the total invoce for item2 is: $"+item2.calculateInvoice());
    }

}
