package dev.aman;


import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;


    LinkedList<Song> songs = new LinkedList<>();//preferences for constant
    // insertion/deletion  that arrayList


    //Album Constructor
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;

        System.out.println("New Album Added to Playlist");
    }

    public LinkedList<Song> getSongsList() {
        return songs;
    }

    public void setSongsList(LinkedList<Song> songsList) {
        this.songs = songsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSong(String name, double duration){
        songs.add(new Song(name,duration));
        System.out.println("new song " + name + ": " + duration + "s" + " added to album " + this.name);

    }


    private Song findSong(String name){
        for (Song song:this.songs
             ) {
            if(song.getName().equals(name)){
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber ,LinkedList<Song> playlist){
        int index=trackNumber-1;
        if((index>0)&&(index<=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't contain track no" + trackNumber);
        return false;
    }


    public boolean addToPlayList(String songTitle,LinkedList<Song> playlist){
        Song checkedSong=findSong(songTitle);
        if(checkedSong!=null){
            playlist.add(checkedSong);
            System.out.println("Song " + songTitle + " added to playlist");
            return true;
        }
        System.out.println("Can not find song");
        return false;
    }



}
