package ru.job4j.oop;

public class Ball {
    private String status;

    public void setStatus(boolean condition) {
        this.status = condition ? "колобок сбежал" : "колобок съеден";
    }

    public void tryRun() {

        System.out.println(this.status);
    }
}
