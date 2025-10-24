import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Product");
            System.out.println("2. Stock In");
            System.out.println("3. Stock Out");
            System.out.println("4. Display All Products");
            System.out.println("5. Generate Report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter product price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int qty = sc.nextInt();
                    Product p = new Product(id, name, price, qty);
                    inventory.addProduct(p);
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    id = sc.next();
                    System.out.print("Enter quantity to add: ");
                    qty = sc.nextInt();
                    inventory.updateStock(id, qty, true);
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    id = sc.next();
                    System.out.print("Enter quantity to remove: ");
                    qty = sc.nextInt();
                    inventory.updateStock(id, qty, false);
                    break;
                case 4:
                    inventory.displayAll();
                    break;
                case 5:
                    inventory.generateReport();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 0);

        sc.close();
    }
}

