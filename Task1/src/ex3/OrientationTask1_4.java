package ex3;

public class OrientationTask1_4 {
    public static void main(String[] args) {
    // Create first customer
        Customer customer1 = new Customer();

        // Simulate some delay (for example, 2 seconds)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set end time and calculate time spent for customer1
        customer1.setEndTime(System.currentTimeMillis());
        System.out.println("Customer ID: " + customer1.getId());
        System.out.println("Start Time: " + customer1.getStartTime());
        System.out.println("End Time: " + customer1.getEndTime());
        System.out.println("Time Spent: " + customer1.getTimeSpent() + " milliseconds");

        // Create second customer to confirm ID increment
        Customer customer2 = new Customer();
        customer2.setEndTime(System.currentTimeMillis());
        System.out.println("\nCustomer ID: " + customer2.getId());
        System.out.println("Start Time: " + customer2.getStartTime());
        System.out.println("End Time: " + customer2.getEndTime());
        System.out.println("Time Spent: " + customer2.getTimeSpent() + " milliseconds");
    }
}