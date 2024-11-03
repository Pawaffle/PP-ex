package ex2;

import java.util.List;

public class EventListApp {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Generate some events with random event times
        eventList.addEvent(new Event("Event1", 5000));
        eventList.addEvent(new Event("Event2", 3000));
        eventList.addEvent(new Event("Event3", 7000));
        eventList.addEvent(new Event("Event4", 1000));
        eventList.addEvent(new Event("Event5", 2000));

        System.out.println("Next event to be processed:");
        Event nextEvent = eventList.getNextEvent();
        System.out.println(nextEvent);

        System.out.println("\nAll events in chronological order:");
        List<Event> orderedEvents = eventList.getEventsInChronologicalOrder();
        orderedEvents.forEach(System.out::println);
    }
}

