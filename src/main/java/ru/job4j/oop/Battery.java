package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void addLoad(int load) {
        this.load += load;
    }

    public void exchange(Battery another) {
        another = new Battery(another.getLoad() + this.load);
        this.load = 0;
    }
}
