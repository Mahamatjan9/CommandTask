import Service.DeliveryCompanyService;
import entities.Customer;
import entities.Load;
import entities.Order;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        DeliveryCompanyService d = new DeliveryCompanyService();
        d.acceptOrder(customer);
    }
}