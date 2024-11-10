import java.util.ArrayList;

public class EventList {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}
