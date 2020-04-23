package edu.wctc.service;

import edu.wctc.dao.MusicDAO;
import entity.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {
    //inject MusicDAO
    @Autowired
    private MusicDAO musicDAO;

    @Override
    @Transactional
    public List<Music> getMusic() {
        return musicDAO.getMusic();
    }

    @Override
    @Transactional
    public void saveMusic(Music theMusic) {
        musicDAO.saveMusic(theMusic);

    }

    @Override
    @Transactional
    public Music getMusic(int theId) {
        return musicDAO.getMusic(theId);
    }

    @Override
    @Transactional
    public void deleteMusic(int theId) {
        musicDAO.deleteMusic(theId);

    }

    @Override
    @Transactional
    public List<Music> getMusicByTitle(String theSearchTerm) {
        return musicDAO.getMusicByTitle(theSearchTerm);
    }
}
