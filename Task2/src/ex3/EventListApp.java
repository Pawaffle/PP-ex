package ex3;

import java.util.List;

public class EventListApp {
    public static void main(String[] args) {
        EventList eventList = new EventList();

        // Generate some events with random event times and types
        eventList.addEvent(new Event("Event1", 5000, EventType.ARRIVAL));
        eventList.addEvent(new Event("Event2", 3000, EventType.EXIT));
        eventList.addEvent(new Event("Event3", 7000, EventType.ARRIVAL));
        eventList.addEvent(new Event("Event4", 1000, EventType.EXIT));
        eventList.addEvent(new Event("Event5", 2000, EventType.ARRIVAL));

        System.out.println("Next event to be processed:");
        Event nextEvent = eventList.getNextEvent();
        System.out.println(nextEvent);

        System.out.println("\nAll events in chronological order:");
        List<Event> orderedEvents = eventList.getEventsInChronologicalOrder();
        orderedEvents.forEach(System.out::println);
    }
}


