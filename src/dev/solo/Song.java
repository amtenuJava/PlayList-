package dev.solo;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }


    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + ": "+ this.duration;
    }
}
