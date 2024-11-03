package ex4;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerQueueApp {
    public static void main(String[] args) {
        LinkedList<Customer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the Customer Queue Management System.");
        System.out.println("Enter 'add' to enqueue a customer, 'remove' to dequeue, or 'exit' to quit.");

        while (true) {
            System.out.print("Enter your action: ");
            input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "add":
                    Customer newCustomer = new Customer();
                    newCustomer.setStartTime(System.nanoTime());  // Set start time at enqueue
                    customerQueue.addFirst(newCustomer);  // Enqueue the customer at the front
                    System.out.println("Customer with ID " + newCustomer.getId() + " has been added to the queue.");
                    break;

                case "remove":
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is empty. No customers to remove.");
                    } else {
                        Customer removedCustomer = customerQueue.removeLast();  // Dequeue from the end
                        removedCustomer.setEndTime(System.nanoTime());  // Set end time at dequeue
                        long timeSpentInQueue = removedCustomer.getTimeSpent();  // Calculate time in queue
                        System.out.println("Customer with ID " + removedCustomer.getId() + " has been removed from the queue.");
                        System.out.println("Time spent in queue: " + timeSpentInQueue + " nanoseconds.");
                    }
                    break;

                case "exit":
                    System.out.println("Exiting the Customer Queue Management System. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid input. Please enter 'add', 'remove', or 'exit'.");
            }
        }
    }
}