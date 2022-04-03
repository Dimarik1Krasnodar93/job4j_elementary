package ru.job4j.oop;

public class Jukebox {
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

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(1);
        petya.music(2);
        petya.music(4);

    }
}
