package entities;

public class Order {
    private  int orderFee;
    private int load;


    public Order(int orderFee, int load) {
        this.orderFee = orderFee;
        this.load = load;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderFree=" + orderFee +
                ", load=" + load +
                '}';
    }
}
