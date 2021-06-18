package com.kaiyko.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */
public class SubscriptionSubject implements Subject {

    //  定义一个集合，用来存储多个观察者对象
    private List<Observer> userList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : userList) {
            observer.update(message);
        }
    }
}
