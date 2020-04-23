package edu.wctc.service;

import edu.wctc.dao.PublisherDAO;
import entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PublisherServiceImpl implements PublisherService {
   @Autowired
    private PublisherDAO publisherDAO;

    @Override
    @Transactional
    public List<Publisher> getPublisher() {
        return publisherDAO.getPublisher();
    }

    @Override
    @Transactional
    public Publisher getPublisher(int id) {
        return publisherDAO.getPublisher(id);
    }
}
