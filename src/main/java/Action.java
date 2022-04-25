import java.util.ArrayList;

public class Action<A, B, C>
{
    // list with all subscribers of this action
    private ArrayList<Event<A, B, C>> subscribers = new ArrayList<>();

    // adds a new subscriber to the subscriber list
    public void subscribe(Event<A, B, C> event)
    {
        subscribers.add(event);
    }

    // notifies all subscribers that the event has occurred
    public void notify(A a, B b, C c)
    {
        if(subscribers.isEmpty())
            return;

        for(Event<A, B, C> event : subscribers)
            event.Action(a, b, c);
    }
}