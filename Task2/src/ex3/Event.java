package ex3;

public class Event implements Comparable<Event> {
    private String name;
    private long eventTime;
    private EventType eventType;

    public Event(String name, long eventTime, EventType eventType) {
        this.name = name;
        this.eventTime = eventTime;
        this.eventType = eventType;
    }

    public String getName() {
        return name;
    }

    public long getEventTime() {
        return eventTime;
    }

    public EventType getEventType() {
        return eventType;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', eventTime=" + eventTime + ", eventType=" + eventType + "}";
    }
}


