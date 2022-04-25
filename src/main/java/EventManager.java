public final class EventManager
{
    // declaration of the event signature (String, Integer, Float)
    public Action<String, Integer, Float> OnEventOccurred = new Action();

    // event manager instance
    private static EventManager Instance = null;

    // get the event manager instance
    public static EventManager getInstance()
    {
        if(Instance == null)
            Instance = new EventManager();

        return Instance;
    }
}