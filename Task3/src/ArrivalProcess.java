import distributions.ContinuousGenerator;

public class ArrivalProcess {
    private final ContinuousGenerator generator;

    public ArrivalProcess(ContinuousGenerator generator) {
        this.generator = generator;
    }

    public void createArrival(EventList eventList, Clock clock) {
        // Generate the interval between events
        long interval = (long) generator.sample();

        // Set a new time based on the current time + interval
        long eventTime = clock.getTime() + interval;

        // Create an event and add it to the list of events
        Event event = new Event(EventType.ARRIVAL, eventTime);
        eventList.addEvent(event);

        // Updating the clock time
        clock.setTime(eventTime);
    }
}