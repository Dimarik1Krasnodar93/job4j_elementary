package ru.job4j.condition;

import java.util.Date;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        idea += "But I am a newbie.";
        int year = 2022;

        idea += year;
        System.out.println(idea);
    }
}
