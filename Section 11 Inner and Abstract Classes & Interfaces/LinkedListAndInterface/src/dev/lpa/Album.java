package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<dev.lpa.Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<dev.lpa.Song>();
    }

    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new dev.lpa.Song(title, duration));
            return true;
        }
        return false;
    }

    private dev.lpa.Song findSong(String title) {
        for(dev.lpa.Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<dev.lpa.Song> playList) {
        int index = trackNumber -1;
        if((index >0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<dev.lpa.Song> playList) {
        dev.lpa.Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }



















}
