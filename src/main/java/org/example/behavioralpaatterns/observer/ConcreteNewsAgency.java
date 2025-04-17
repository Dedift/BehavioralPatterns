package org.example.behavioralpaatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsAgency implements NewsAgency {
    private List<NewsSubscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\nНовостное агентство публикует: " + news);
        notifySubscribers(news);
    }

    @Override
    public void registerSubscriber(NewsSubscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println(subscriber.getName() + " подписался на новости");
    }

    @Override
    public void removeSubscriber(NewsSubscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println(subscriber.getName() + " отписался от новостей");
    }

    @Override
    public void notifySubscribers(String news) {
        for (NewsSubscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
