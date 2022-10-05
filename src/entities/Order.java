package entities;

public class Order {
    private  int olderFree;
    private int laad;


    public Order(int olderFree, int laad) {
        this.olderFree = olderFree;
        this.laad = laad;
    }

    public int getOlderFree() {
        return olderFree;
    }

    public void setOlderFree(int olderFree) {
        this.olderFree = olderFree;
    }

    public int getLaad() {
        return laad;
    }

    public void setLaad(int laad) {
        this.laad = laad;
    }

    @Override
    public String toString() {
        return "Order{" +
                "olderFree=" + olderFree +
                ", laad=" + laad +
                '}';
    }
}
