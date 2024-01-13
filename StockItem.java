public class StockItem {
        private int stockNumber;
        private String name;
        private double price;
        private int totalStock;

        public StockItem(int stockNumber, String name, double price) {
            this.stockNumber = stockNumber;
            this.name = name;
            this.price = price;
            this.totalStock = 0;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void addToStock(int quantity) {
            if (quantity > 0) {
                totalStock += quantity;
            }
        }
        public double calculateTotalValue() {
            return price * totalStock;
        }
        public int getStockNumber() {
            return stockNumber;
        }
     public String getName() {
            return name;
        }
    public double getPrice() {
            return price;
        }
    
        public int getTotalInStock() {
            return totalStock;
        }
        public static void main(String[] args) {
            StockItem item = new StockItem(101, "Smartphone", 599.99);
    
            System.out.println("Stock Number: " + item.getStockNumber());
            System.out.println("Name: " + item.getName());
            System.out.println("Price: $" + item.getPrice());
            System.out.println("Total in Stock: " + item.getTotalInStock());
    
        }
    }

