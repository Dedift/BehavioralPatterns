package org.example.behavioralpatterns.observer;

public class NewsPortal implements NewsSubscriber {
    private String name;

    public NewsPortal(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " размещает на главной: \"" + news.toUpperCase() + "\"");
    }

    @Override
    public String getName() {
        return "Новостной портал '" + name + "'";
    }
}