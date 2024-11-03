package ex6;

public class CustomerGenerator {
    private ServicePoint servicePoint;

    // Constructor to initialize the service point
    public CustomerGenerator(ServicePoint servicePoint) {
        this.servicePoint = servicePoint;
    }

    // Method to create the desired number of customers in the service point queue
    public void generateCustomers(int numberOfCustomers) {
        for (int i = 0; i < numberOfCustomers; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}