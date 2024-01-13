public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }
    public Rectangle (double initialLength, double initialWidth){
        length = initialLength;
        width = initialWidth;
    }
    public double calculateArea(){
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        System.out.println("area of rec1 :" + rec1.calculateArea());

        Rectangle rec2 = new Rectangle(4.5, 3.2);
        System.out.println("area of rec2 :"+ rec2.calculateArea());
    
    }
}