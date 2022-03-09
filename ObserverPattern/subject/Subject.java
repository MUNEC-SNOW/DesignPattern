package ObserverPattern.subject;

import ObserverPattern.subject.Observer;

/**
 * @author KW
 */
public interface Subject {
    /**
     * This function is aim to register observers
     * @param o
     */
    void registerObserver(Observer o);
    /**
     * This function is aim to remove observers
     * @param o
     */
    void removeObserver(Observer o);
    /**
     * This function is aim to notify observers
     */
    void notifyObserver();
}
