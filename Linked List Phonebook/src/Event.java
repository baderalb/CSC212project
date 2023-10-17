import java.util.*;
import java.text.SimpleDateFormat;
public class Event{

    String title;
    Date date;
    String location;
    Contact c;
    Event next;

    public Event(String title, Date date, String location, Contact c) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.c = c;next=null;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        String formattedDate = dateFormat.format(date);
        return "Event title: " + title + "\n" +
               "Contact name: " + c.name + "\n" +
               "Event date and time (MM/DD/YYYY HH:MM): " + formattedDate + "\n" +
               "Event location: " + location;
    }
}

	