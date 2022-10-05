package entities;

public class Customer {
    private String customerName;
    private Order order;


    public Customer(String customerName, Order order) {
        this.customerName = customerName;
        this.order = order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", order=" + order +
                '}';
    }
}
