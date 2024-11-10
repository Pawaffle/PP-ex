import distributions.Normal;

public class ex6 {
    public static void main(String[] args) {
        // Create a random number generator following a normal distribution with parameters (mean = 10, standard deviation = 2)
        Normal generator = new Normal(10, 2);

        // Create instances of Clock, EventList and ArrivalProcess
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess(generator);

        // Create 10 events
        for (int i = 0; i < 10; i++) {
            arrivalProcess.createArrival(eventList, clock);
        }

        // Display the list of events
        eventList.printEvents();
    }
}
