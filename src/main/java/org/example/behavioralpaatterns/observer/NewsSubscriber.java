package org.example.behavioralpaatterns.observer;

public interface NewsSubscriber {
    void update(String news);
    String getName();
}