public class Clock {
    private static Clock instance;   // A single instance of Clock
    private long time;   // Variable for storing the time

    // Private constructor to prevent an instance from being created outside the class
    private Clock() {
        this.time = 0;
    }

    // Static method to get a single instance of Clock
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method for setting the time
    public void setTime(long time) {
        this.time = time;
    }

    // Method for obtaining the current time
    public long getTime() {
        return time;
    }

    public void moveForward(long timeUnits) {
        this.time += timeUnits;
    }
}