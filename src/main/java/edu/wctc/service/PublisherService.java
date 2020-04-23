package edu.wctc.service;

import entity.Publisher;

import java.util.List;

public interface PublisherService {
    List<Publisher> getPublisher();

    Publisher getPublisher(int id);
}
