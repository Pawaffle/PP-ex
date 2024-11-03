package ex5;

public class ServicePointApp {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator customerGenerator = new CustomerGenerator(servicePoint);

        int numberOfCustomers = 5;  // Adjust the number of customers as needed
        customerGenerator.generateCustomers(numberOfCustomers);

        System.out.println("\nStarting service for all customers in the queue...\n");
        servicePoint.serve();
    }
}
