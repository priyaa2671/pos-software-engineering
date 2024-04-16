import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Checkstyle: src/main/resources/google_checks.xml

public class Main {
    public static void main(String[] args) {
        // Create some sample data
        Customer customer = new Customer();
        customer.setCustomerName("John Doe");
        customer.setContactInformation("1244567990");
        customer.setDeliveryAddress("1234 Oklahoma St");

        List<Item> items = new ArrayList<>();
        Item item1 = new Item("Milk", "Milk", 2, 10.99);
        Item item2 = new Item("Bread", "Bread", 1, 7.99);
        items.add(item1);
        items.add(item2);

        for (Item item : items) {
            item.setCustomer(customer);
        }

        // Calculate total cost
        double totalCost = 0;
        for (Item item : items) {
            totalCost += item.getUnitPrice() * item.getItemQuantity();
        }

        // Display customer information
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Contact Information: " + customer.getContactInformation());
        System.out.println("Delivery Address: " + customer.getDeliveryAddress());

        // Display items
        System.out.println("\nItems:");
        for (Item item : items) {
            System.out.println(item.getItemName() + " - " + item.getItemDescription() + " - Quantity: " + item.getItemQuantity() + " - Price: $" + item.getUnitPrice());
        }

        // Display total cost
        System.out.println("\nTotal Cost: $" + totalCost);
    }
}

class Customer {
    private String customerName;
    private String contactInformation;
    private String deliveryAddress;

    // Getters and setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}

class Item {
    private String itemName;
    private String itemDescription;
    private int itemQuantity;
    private double unitPrice;
    private Customer customer; // Many-to-one association with Customer

    // Constructor
    public Item(String itemName, String itemDescription, int itemQuantity, double unitPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.unitPrice = unitPrice;
    }

    // Getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
