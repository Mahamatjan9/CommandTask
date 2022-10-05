package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Load;
import entities.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies;

    public void acceptOrder() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = s.nextLine();
        System.out.print("Enter height: ");
        int height = s.nextInt();
        System.out.print("Enter width: ");
        int width = s.nextInt();
        System.out.print("Enter weight: ");
        int weight = s.nextInt();

        Customer customer = new Customer(customerName, new Order(0, new Load(height, width, weight)));

        if (!deliveryCompanies.isEmpty()) {
            System.out.println("Choose delivery company:");
            for (int i = 0; i < deliveryCompanies.size(); i++) {
                System.out.printf("%d: %s, price: %d", i + 1, deliveryCompanies.get(i).getDeliveryCompanyName(), deliveryCompanies.get(i).getPricePerKilogram());
            }
            int target = s.nextInt();
            if ((customer.getOrder().getLoad().getHeight() +
                    customer.getOrder().getLoad().getWidth()) * 2 <=
                    deliveryCompanies.get(target).getMaxCapacityPerSquareCentimeter())
            {
                deliveryCompanies.get(s.nextInt()).addCustomer(customer);
            }
            else {
                System.out.println("Max order capacity for this company is reached.");
            }
        } else System.out.println("No companies created.");

    }
}
