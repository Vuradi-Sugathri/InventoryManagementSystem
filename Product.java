class Product {
    private String id;       // Unique number for product
    private String name;     // Name of product
    private int quantity;    // How many items
    private double price;    // Price per item

    // Constructor - this makes a new product
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Add stock
    public void addStock(int qty) {
        this.quantity += qty;
    }

    // Remove stock
    public void removeStock(int qty) {
        if(qty <= this.quantity) {
            this.quantity -= qty;
        } else {
            System.out.println("Oops! Not enough stock.");
        }
    }

    // Display product info
    public void display() {
        System.out.println(id + " | " + name + " | $" + price + " | Qty: " + quantity);
    }

    // Getters (for Inventory class to find product)
    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
