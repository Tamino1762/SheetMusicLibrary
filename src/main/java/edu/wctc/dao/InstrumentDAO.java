package edu.wctc.dao;

import entity.MusicInstrument;

import java.util.List;

public interface InstrumentDAO {
    List<MusicInstrument> getInstrument();

    MusicInstrument getInstrument(int id);
}
