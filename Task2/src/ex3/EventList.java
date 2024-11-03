package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> eventQueue;

    public EventList() {
        eventQueue = new PriorityQueue<>();  // Events are ordered by eventTime due to Comparable
    }

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public Event getNextEvent() {
        return eventQueue.poll();  // Retrieves and removes the next event in chronological order
    }

    // Method to return events in chronological order without modifying the queue
    public List<Event> getEventsInChronologicalOrder() {
        return new ArrayList<>(eventQueue).stream()
                .sorted()  // Sort by event time (natural ordering by Comparable)
                .toList();
    }
}
