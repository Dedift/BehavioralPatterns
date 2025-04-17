package org.example.behavioralpatterns.observer;

public interface NewsAgency {
    void registerSubscriber(NewsSubscriber subscriber);
    void removeSubscriber(NewsSubscriber subscriber);
    void notifySubscribers(String news);
}
