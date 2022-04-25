public class Main
{
    public static void main(String[] args)
    {
        // create displays
        DisplayA displayAlpha = new DisplayA();
        DisplayB displayBeta = new DisplayB();

        // get event manager instance
        EventManager instance = EventManager.getInstance();

        // notify all subscribers that this event has occurred
        instance.OnEventOccurred.notify("A message to all subscribers =)!", 10, 5.5f);
    }
}