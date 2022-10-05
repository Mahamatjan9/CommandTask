package Service;

import entities.Customer;
import entities.DeliveryCompany;

import java.util.ArrayList;
import java.util.Scanner;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies;

    public void acceptOrder(Customer customer) {
        /* remove in main branch
        System.out.print("Enter customer name: ");
        Scanner s = new Scanner(System.in);
        String customerName = s.nextLine();
        System.out.print("Enter height: ");
        int height = s.nextInt();
        System.out.print("Enter width: ");
        int width = s.nextInt();
        System.out.print("Enter weight: ");
        int weight = s.nextInt();
        System.out.print("Enter length: ");
        int length = s.nextInt();
        Customer customer = new Customer(customerName, new Order(0, new Load(height, width, weight, length)));
*/
        Scanner s = new Scanner(System.in);
        if (deliveryCompanies.isEmpty()) {
            System.out.println("No companies created.");
        } else {
            System.out.println("Choose delivery company:");
            for (int i = 0; i < deliveryCompanies.size(); i++) {
                System.out.printf("%d: %s, price: %d", i + 1, deliveryCompanies.get(i).getDeliveryCompanyName(), deliveryCompanies.get(i).getPricePerKilogram());
            }
            int target = s.nextInt();
            if (target < 0 || target >= deliveryCompanies.size())
                System.out.println("Invalid target");
            else {
                if ((customer.getOrder().getLoad().getHeight() *
                        customer.getOrder().getLoad().getWidth() *
                        customer.getOrder().getLoad().getLength()) >
                        deliveryCompanies.get(target).getMaxCapacityPerSquareCentimeter()) {
                    System.out.println("Max order capacity for this company is reached.");
                } else {
                    System.out.println(customer.getOrder().getOrderFee());
                    customer.getOrder().setOrderFee(deliveryCompanies.get(target).getPricePerKilogram() *
                            customer.getOrder().getLoad().getWeight());
                    System.out.println(customer.getOrder().getOrderFee());
                    deliveryCompanies.get(target).addCustomer(customer);
                }
            }
        }

    }
}
