package ObserverPattern.subject;

/**
 * @author KW
 */
public interface Observer {
    /**
     * Every obserser need to create this function
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
