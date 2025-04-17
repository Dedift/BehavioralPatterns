package org.example.behavioralpatterns.observer;

public class Newspaper implements NewsSubscriber {
    private String name;

    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " публикует в газете: \"" + shortenNews(news) + "\"");
    }

    private String shortenNews(String news) {
        return news.length() > 30 ? news.substring(0, 30) + "..." : news;
    }

    @Override
    public String getName() {
        return "Газета '" + name + "'";
    }
}