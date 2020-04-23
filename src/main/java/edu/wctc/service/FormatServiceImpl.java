package edu.wctc.service;

import edu.wctc.dao.FormatDAO;
import entity.Format;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FormatServiceImpl implements FormatService {

    @Autowired
    private FormatDAO formatDAO;


    @Override
    @Transactional
    public List<Format> getFormat() {
        return formatDAO.getFormat();
    }

    @Override
    @Transactional
    public Format getFormat(int id) {
        return formatDAO.getFormat(id);
    }
}
