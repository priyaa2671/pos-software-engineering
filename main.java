import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create some sample data
        Customer customer = new Customer("John Doe", "1244567990", "1234 Oklahoma St");

        List<Item> items = new ArrayList<>();
        items.add(new Item("Milk", "Dairy Product", 2, 10.99));
        items.add(new Item("Bread", "Bakery Product", 1, 7.99));

        // Associate customer with items
        for (Item item : items) {
            item.setCustomer(customer);
        }

        // Calculate total cost
        double totalCost = 0.0;
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
            System.out.printf("%s - %s - Quantity: %d - Price: $%.2f\n",
                    item.getItemName(), item.getItemDescription(), item.getItemQuantity(), item.getUnitPrice());
        }

        // Display total cost
        System.out.printf("\nTotal Cost: $%.2f\n", totalCost);
    }
}

class Customer {
    private final String customerName;
    private final String contactInformation;
    private final String deliveryAddress;

    public Customer(String customerName, String contactInformation, String deliveryAddress) {
        this.customerName = customerName;
        this.contactInformation = contactInformation;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters (unchanged)
    public String getCustomerName() {
        return customerName;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }
}

class Item {
    private final String itemName;
    private final String itemDescription;
    private final int itemQuantity;
    private final double unitPrice;
    private Customer customer; // Many-to-one association with Customer

    public Item(String itemName, String itemDescription, int itemQuantity, double unitPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemQuantity = itemQuantity;
        this.unitPrice = unitPrice;
    }

    // Getters (unchanged)
    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Order {
    private Date transactionDate;
    private Customer customer;
    private List<Item> items;

    public Order(Date transactionDate, Customer customer, List<Item> items) {
        this.transactionDate = transactionDate;
        this.customer = customer;
        this.items = items;
    }

    // Getters and setters
    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

class Payment {
    private Date paymentDate;
    private double paymentAmount;
    private String paymentMethod;
    private String paymentStatus;
    private Customer customer;

    public Payment(Date paymentDate, double paymentAmount, String paymentMethod, String paymentStatus, Customer customer) {
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.customer = customer;
    }

    // Getters and setters
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Shipment {
    private Date shipmentDate;
    private String shipmentStatus;
    private String shippingMethod;
    private String shippingInformation;
    private Customer customer;

    public Shipment(Date shipmentDate, String shipmentStatus, String shippingMethod, String shippingInformation, Customer customer) {
        this.shipmentDate = shipmentDate;
        this.shipmentStatus = shipmentStatus;
        this.shippingMethod = shippingMethod;
        this.shippingInformation = shippingInformation;
        this.customer = customer;
    }

    // Getters and setters
    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getShippingInformation() {
        return shippingInformation;
    }

    public void setShippingInformation(String shippingInformation) {
        this.shippingInformation = shippingInformation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

class Supplier {
    private String supplierName;
    private String supplierContactInformation;

    public Supplier(String supplierName, String supplierContactInformation) {
        this.supplierName = supplierName;
        this.supplierContactInformation = supplierContactInformation;
    }

    // Getters and setters
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierContactInformation() {
        return supplierContactInformation;
    }

    public void setSupplierContactInformation(String supplierContactInformation) {
        this.supplierContactInformation = supplierContactInformation;
    }
}
