package edu.wctc.dao;

import entity.Music;

import java.util.List;

public interface MusicDAO {

    List<Music> getMusic();
    void saveMusic(Music theMusic);
    Music getMusic(int theId);
    void deleteMusic(int theId);
    List<Music> getMusicByTitle(String theSearchTerm);
}
