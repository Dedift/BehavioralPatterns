package org.example.behavioralpatterns.observer;

public interface NewsSubscriber {
    void update(String news);
    String getName();
}