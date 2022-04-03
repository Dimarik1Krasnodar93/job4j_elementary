package ru.job4j.oop;

public class Fox {
    public void tryEat(Ball ball) {
        ball.setStatus(false);
        ball.tryRun();
    }
}
