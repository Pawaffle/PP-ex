package ex3;

public class Customer {
    private static int nextId = 1;  // Static field to keep track of the next ID
    private int id;
    private long startTime;
    private long endTime;

    // Constructor that initializes start time and assigns a unique id
    public Customer() {
        this.id = nextId++;
        this.startTime = System.currentTimeMillis(); // Start time initialized to current time in milliseconds
    }

    // Getter and setter for startTime
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    // Getter and setter for endTime
    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Method to calculate time spent (endTime - startTime)
    public long getTimeSpent() {
        return endTime - startTime;
    }
}
