package edu.wctc.dao;

import entity.Publisher;

import java.util.List;

public interface PublisherDAO {
    List<Publisher> getPublisher();

    Publisher getPublisher(int id);
}
