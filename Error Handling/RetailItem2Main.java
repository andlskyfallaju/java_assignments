import java.util.*;

public class RetailItem2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int item1units = 0, item2units = 0, item3units = 0;
        double item1price = 0, item2price = 0, item3price = 0;
        boolean success = false;

        try {
            System.out.println("Enter number of items for Jacket: ");
            item1units = input.nextInt();
            System.out.println("Enter number of items for Designer Jeans: ");
            item2units = input.nextInt();
            System.out.println("Enter number of items for Shirt: ");
            item3units = input.nextInt();

            System.out.println("Enter price for Jacket: ");
            item1price = input.nextDouble();
            System.out.println("Enter price for Designer Jeans: ");
            item2price = input.nextDouble();
            System.out.println("Enter price for Shirt: ");
            item3price = input.nextDouble();

            // Explicitly validate negative numbers here or let the constructor do it.
            // Let's do a quick check here to provide immediate feedback.
            if (item1units < 0 || item2units < 0 || item3units < 0 ||
                item1price < 0 || item2price < 0 || item3price < 0) {
                throw new IllegalArgumentException("No negative numbers allowed!");
            }
            success = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Create three RetailItem objects with the specified data.
        finally {
            RetailItem2 item1 = new RetailItem2("Jacket", item1units, item1price);
            RetailItem2 item2 = new RetailItem2("Designer Jeans", item2units, item2price);
            RetailItem2 item3 = new RetailItem2("Shirt", item3units, item3price);

            System.out.printf("%-10s %-20s %-15s %-10s\n", "", "Description", "Units on Hand", "Price");
            System.out.println("------------------------------------------------------------------");

            System.out.printf("Item #1    %-20s %-15d %-10.2f\n",
                    item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
            System.out.printf("Item #2    %-20s %-15d %-10.2f\n",
                    item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
            System.out.printf("Item #3    %-20s %-15d %-10.2f\n",
                    item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());
        }
    }
}
