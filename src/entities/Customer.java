package entities;

public class Customer {
    private String customerName;
    private int order;


    public Customer(String customerName, int order) {
        this.customerName = customerName;
        this.order = order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
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
