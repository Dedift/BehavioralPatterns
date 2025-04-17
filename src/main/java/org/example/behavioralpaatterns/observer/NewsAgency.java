package org.example.behavioralpaatterns.observer;

public interface NewsAgency {
    void registerSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void notifySubscribers(String news);
}
