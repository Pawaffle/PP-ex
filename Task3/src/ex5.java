public class ex5 {
    public static void main(String[] args) {
        // Getting an instance of Clock
        Clock clock = Clock.getInstance();

        // Time set
        clock.setTime(5000);
        System.out.println("Current time: " + clock.getTime());

        // Time change
        clock.setTime(10000);
        System.out.println("Updated time: " + clock.getTime());

        // Checking that the same Clock instance is used
        Clock anotherClockReference = Clock.getInstance();
        System.out.println("Time from another reference: " + anotherClockReference.getTime());
    }
}

