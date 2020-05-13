package edu.wctc.service;

import entity.MusicInstrument;

import java.util.List;

public interface InstrumentService {
    List<MusicInstrument> getInstrument();

    MusicInstrument getInstrument(int instrumentId);
}
