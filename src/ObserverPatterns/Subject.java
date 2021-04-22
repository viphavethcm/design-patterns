package ObserverPatterns;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> listObserver = new ArrayList<>();
    public void AttachObserver(Observer observer){
        listObserver.add(observer);
    }

    public void DetachObserver(Observer observer){
        listObserver.remove(observer);
    }

    public void NotifyObserver(Subject subject, Object arg){
        listObserver.forEach(observer -> observer.Notify(subject,arg));
    }
}
