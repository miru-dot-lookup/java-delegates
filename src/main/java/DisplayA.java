public class DisplayA
{
    public DisplayA()
    {
        // get event manager instance
        EventManager instance = EventManager.getInstance();

        // subscribe to the event "OnEventOccurred" with the method "displayEventOccurred"
        instance.OnEventOccurred.subscribe(this::displayEventOccurred);
    }

    private void displayEventOccurred(String stringParam, int intParam, float floatParam)
    {
        // modify values
        intParam += 10;
        floatParam -= 10.5f;

        // display values
        System.out.println("Alpha Display : " + stringParam + " int: " + intParam + " float: " + floatParam);
    }
}