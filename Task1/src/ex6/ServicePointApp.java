package ex6;

public class ServicePointApp {
    public static void main(String[] args) {
        int runs = 3;  // Number of times to run the application
        int customersPerRun = 5;

        for (int i = 1; i <= runs; i++) {
            System.out.println("\n--- Run " + i + " ---");
            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator customerGenerator = new CustomerGenerator(servicePoint);

            customerGenerator.generateCustomers(customersPerRun);
            System.out.println("\nStarting service for all customers in the queue...\n");
            servicePoint.serve();
        }
    }
}

