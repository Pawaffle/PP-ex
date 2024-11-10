public class Event {
    private EventType type;
    private long time;

    public Event(EventType type, long time) {
        this.type = type;
        this.time = time;
    }

    public EventType getType() {
        return type;
    }

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Event[type=" + type + ", time=" + time + "]";
    }
}