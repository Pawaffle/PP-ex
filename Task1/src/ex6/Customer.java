package ex6;

public class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;
    private long serviceTime;

    public Customer() {
        this.id = nextId++;
        this.startTime = System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }

    // Setter and getter for service time
    public void setServiceTime(long serviceTime) {
        this.serviceTime = serviceTime;
    }

    public long getServiceTime() {
        return serviceTime;
    }
}
