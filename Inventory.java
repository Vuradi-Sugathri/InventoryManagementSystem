import java.util.ArrayList;

class Inventory {
    private ArrayList<Product> products = new ArrayList<>();

    // Add a product
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added successfully!");
    }

    // Update stock (add or remove)
    public void updateStock(String productId, int qty, boolean isAdding) {
        for(Product p : products) {
            if(p.getId().equals(productId)) {
                if(isAdding) {
                    p.addStock(qty);
                    System.out.println("Stock added successfully!");
                } else {
                    p.removeStock(qty);
                }
                return;
            }
        }
        System.out.println("Product not found!");
    }

    // Display all products
    public void displayAll() {
        System.out.println("ID | Name | Price | Quantity");
        for(Product p : products) {
            p.display();
        }
    }

    // Total inventory value
    public void generateReport() {
        double totalValue = 0;
        for(Product p : products) {
            totalValue += p.getPrice() * p.getQuantity();
        }
        System.out.println("Total inventory value: $" + totalValue);
    }
}
