package edu.wctc.service.converter;

import edu.wctc.service.InstrumentService;
import entity.MusicInstrument;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.convert.converter.Converter;

public class StringToInstrumentConverter implements Converter<String, MusicInstrument> {
    @Autowired
    private InstrumentService instrumentService;

    @Override
    public MusicInstrument convert(String source){
        int instrumentId = Integer.parseInt(source);
        MusicInstrument instrument = instrumentService.getInstrument(instrumentId);

        return instrument;
    }
}
