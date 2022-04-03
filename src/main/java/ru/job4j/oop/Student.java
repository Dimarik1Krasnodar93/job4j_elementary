package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }

    public void music(int position) {
        String song = "";
        switch (position) {
            case 1:
                song = "Пусть бегут неуклюже";
                break;
            case 2:
                song = "Спокойной ночи";
                break;
            default:
                song = "Песня не найдена";
        }
        System.out.println(song);
    }

    public void song() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(1);
        petya.music(2);
        petya.music(4);
        petya.song();
        petya.song();
        petya.song();
    }
}
