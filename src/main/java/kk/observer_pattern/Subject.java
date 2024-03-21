package kk.observer_pattern;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
