package edu.wctc.service;

import entity.Music;

import java.util.List;

public interface MusicService {

    List<Music> getMusic();
    void saveMusic(Music theMusic);
    Music getMusic(int theId);
    void deleteMusic(int theId);
    List<Music> getMusicByTitle(String theSearchTerm);
}
