public class DisplayB
{
    public DisplayB()
    {
        // get event manager instance
        EventManager instance = EventManager.getInstance();

        // create the event function with lambda expression
        Event<String, Integer, Float> betaDisplayEvent = (stringParam, intParam, floatParam) ->
                System.out.println("Beta Display: " + stringParam + " int: " + intParam + " float: " + floatParam);

        // subscribe to the event "OnEventOccurred" with the event "betaDisplayEvent"
        instance.OnEventOccurred.subscribe(betaDisplayEvent);
    }
}