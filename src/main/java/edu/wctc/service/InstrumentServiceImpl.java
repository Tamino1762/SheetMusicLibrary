package edu.wctc.service;

import edu.wctc.dao.InstrumentDAO;
import entity.MusicInstrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InstrumentServiceImpl implements InstrumentService {

    @Autowired
    private InstrumentDAO instrumentDAO;

    @Override
    @Transactional
    public List<MusicInstrument> getInstrument() {
        return instrumentDAO.getInstrument();
    }

    @Override
    @Transactional
    public MusicInstrument getInstrument(int instrumentId) {
        return instrumentDAO.getInstrument(instrumentId);
    }
}
