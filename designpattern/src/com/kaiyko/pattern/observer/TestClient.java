package com.kaiyko.pattern.observer;

public class TestClient {
    public static void main(String[] args) {
        //  创建订阅用户对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //  订阅公众号
        subject.attach(new User("孙悟空"));
        subject.attach(new User("猪八戒"));
        subject.attach(new User("沙僧"));

        //  公众号更新，发送消息给订阅者（观察者对象）
        subject.notify("公众号更新了");
    }
}
