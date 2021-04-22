package ObserverPatterns;

public abstract class Observer {
    protected Subject subject;
    abstract void Notify(Subject subject,Object arg);
}
