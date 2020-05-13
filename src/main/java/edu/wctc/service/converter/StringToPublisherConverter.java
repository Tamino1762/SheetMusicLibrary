package edu.wctc.service.converter;

import edu.wctc.service.PublisherService;
import entity.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToPublisherConverter implements Converter<String, Publisher> {
    @Autowired
    private PublisherService publisherService;

    public Publisher convert(String source) {
        int publisherId = Integer.parseInt(source);
        Publisher publisher = publisherService.getPublisher(publisherId);
        return publisher;
    }
}
