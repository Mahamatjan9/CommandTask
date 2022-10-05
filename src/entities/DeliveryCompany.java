package entities;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final int pricePerKilogram =200;
    private int  customers;
    private final int maxCapacityPerSquareCentimeter =100;

    public DeliveryCompany(String deliveryCompanyName, int customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }


    public int getPricePerKilogram() {
        return pricePerKilogram;
    }

    public int getCustomers() {
        return customers;
    }

    public void setCustomers(int customers) {
        this.customers = customers;
    }

    public int getMaxCapacityPerSquareCentimeter() {
        return maxCapacityPerSquareCentimeter;
    }

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", pricePerKilogram=" + pricePerKilogram +
                ", customers=" + customers +
                ", maxCapacityPerSquareSantimeter=" + maxCapacityPerSquareCentimeter +
                '}';
    }
}
