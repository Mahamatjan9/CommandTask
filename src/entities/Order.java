package entities;

public class Order {
    private  int orderFee;
    private Load load;


    public Order(int orderFee, Load load) {
        this.orderFee = orderFee;
        this.load = load;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
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
