package ex5;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();

    // Method to add a customer to the queue
    public void addToQueue(Customer customer) {
        queue.addFirst(customer);
        System.out.println("Customer with ID " + customer.getId() + " added to the queue.");
    }

    // Method to remove a customer from the queue (FIFO order)
    public Customer removeFromQueue() {
        return queue.removeLast();
    }

    // Method to serve all customers in the queue
    public void serve() {
        while (!queue.isEmpty()) {
            try {
                Customer currentCustomer = removeFromQueue();
                long waitingTime = System.nanoTime() - currentCustomer.getStartTime();

                // Simulate random service time between 1 to 3 seconds
                long serviceTime = (long) (Math.random() * 2000 + 1000);
                Thread.sleep(serviceTime);

                currentCustomer.setEndTime(System.nanoTime());

                long responseTime = waitingTime + serviceTime * 1_000_000; // Convert ms to ns

                System.out.println("Customer ID: " + currentCustomer.getId());
                System.out.println("Waiting Time: " + waitingTime / 1_000_000 + " ms");
                System.out.println("Service Time: " + serviceTime + " ms");
                System.out.println("Response Time: " + responseTime / 1_000_000 + " ms\n");
            } catch (InterruptedException e) {
                System.out.println("Service interrupted.");
            }
        }
        System.out.println("All customers have been served.");
    }
}

