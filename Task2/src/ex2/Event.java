package ex2;

public class Event implements Comparable<Event> {
    private String name;
    private long eventTime;

    public Event(String name, long eventTime) {
        this.name = name;
        this.eventTime = eventTime;
    }

    public String getName() {
        return name;
    }

    public long getEventTime() {
        return eventTime;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.eventTime, other.eventTime);
    }

    @Override
    public String toString() {
        return "Event{name='" + name + "', eventTime=" + eventTime + "}";
    }
}

