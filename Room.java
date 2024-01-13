public class Room {
    private double width;
    private double length;
    private int floor;

    public Room() {
        this.width = 10;
        this.length = 12.5;
        this.floor = 1;
    }
public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
    public double getLength() {
        return length;
    }
 public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }
 public int getFloor() {
        return floor;
    }
 public void setFloor(int floor) {
        this.floor = floor;
    }
public Room(double length, double width, int floor) {
        setLength(length);
        setWidth(width);
        setFloor(floor);
    }
     public String toString() {
        return length + " x " + width + ", floor " + floor;
    }

    
    public static void main(String[] args) {
       
        Room Room1 = new Room();
        System.out.println("Default Room: " + Room1);

        
        Room Room2 = new Room(15.5, 8.0, 2);
        System.out.println("Custom Room: " + Room2);

        
    }
}

