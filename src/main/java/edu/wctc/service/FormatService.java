package edu.wctc.service;

import entity.Format;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface FormatService {

    List<Format> getFormat();

    Format getFormat(int id);
}
