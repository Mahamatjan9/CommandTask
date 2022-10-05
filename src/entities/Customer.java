package entities;

public class Customer {
    private String customerName;
    private int older;


    public Customer(String customerName, int older) {
        this.customerName = customerName;
        this.older = older;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getOlder() {
        return older;
    }

    public void setOlder(int older) {
        this.older = older;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", older=" + older +
                '}';
    }
}
