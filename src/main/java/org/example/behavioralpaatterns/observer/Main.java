package org.example.behavioralpatterns.observer;

public class Main {
    public static void main(String[] args) {
        // Создаем новостное агентство
        ConcreteNewsAgency agency = new ConcreteNewsAgency();

        // Создаем СМИ (подписчиков)
        NewsSubscriber times = new Newspaper("The Times");
        NewsSubscriber cnn = new TVChannel("CNN");
        NewsSubscriber bbc = new TVChannel("BBC");
        NewsSubscriber portal = new NewsPortal("NewsOnline");

        // Подписываем СМИ на новости
        agency.registerSubscriber(times);
        agency.registerSubscriber(cnn);
        agency.registerSubscriber(portal);

        // Публикуем новость (все подписчики получают ее)
        agency.publishNews("Сегодня состоялся саммит G20 с участием мировых лидеров");

        // Отписываем одно СМИ
        agency.removeSubscriber(cnn);

        // Добавляем новое СМИ
        agency.registerSubscriber(bbc);

        // Публикуем еще одну новость
        agency.publishNews("Ученые обнаружили новую планету в ближайшей звездной системе");

        // Еще одна новость
        agency.publishNews("Курс доллара достиг годового минимума");
    }
}
