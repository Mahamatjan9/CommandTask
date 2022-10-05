package entities;

public class DeliveryConpany {
    private String devileryCompanyName;
    private final int pricePerKilogram =200;
    private int  customers;
    private final int maxCapacityPerSquareSantimeter =100;

    public DeliveryConpany(String devileryCompanyName, int customers) {
        this.devileryCompanyName = devileryCompanyName;
        this.customers = customers;
    }

    public String getDevileryCompanyName() {
        return devileryCompanyName;
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

    public int getMaxCapacityPerSquareSantimeter() {
        return maxCapacityPerSquareSantimeter;
    }

    @Override
    public String toString() {
        return "DeliveryConpany{" +
                "devileryCompanyName='" + devileryCompanyName + '\'' +
                ", pricePerKilogram=" + pricePerKilogram +
                ", customers=" + customers +
                ", maxCapacityPerSquareSantimeter=" + maxCapacityPerSquareSantimeter +
                '}';
    }
}
