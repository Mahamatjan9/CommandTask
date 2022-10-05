package entities;

import java.util.ArrayList;
import java.util.Arrays;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final int pricePerKilogram =200;
    private ArrayList<Customer> customers = new ArrayList<>();
    private final int maxCapacityPerSquareCentimeter =100;

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }


    public int getPricePerKilogram() {
        return pricePerKilogram;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getMaxCapacityPerSquareCentimeter() {
        return maxCapacityPerSquareCentimeter;
    }

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", pricePerKilogram=" + pricePerKilogram +
                ", customers=" + customers.toString() +
                ", maxCapacityPerSquareCentimeter=" + maxCapacityPerSquareCentimeter +
                '}';
    }
}
