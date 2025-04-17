package org.example.behavioralpaatterns.observer;

public class TVChannel implements NewsSubscriber {
    private String name;

    public TVChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " передает в эфире: \"" + news + "\"");
    }

    @Override
    public String getName() {
        return "Телеканал '" + name + "'";
    }
}
